package CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

public class ConexionDB {
public static Connection conectar() {
    Connection cn = null;
    try {
        Class.forName("org.mariadb.jdbc.Driver");
        
        cn = DriverManager.getConnection("jdbc:mariadb://localhost:3016/simulador_redes", "root", "3016");
    } catch (Exception e) {
        System.out.println("Error de conexion: " + e.getMessage());
    }
    return cn;
}
public void registrarDispositivo(String host, String ip, String tipo, int idProyecto) {
        String sql = "INSERT INTO dispositivos (hostname, ip_address, tipo, id_proyecto) VALUES (?, ?, ?, ?)";
        try (Connection cn = conectar(); 
             PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, host);
            pst.setString(2, ip);
            pst.setString(3, tipo);
            pst.setInt(4, idProyecto);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    public DefaultTableModel obtenerDispositivos() {
        DefaultTableModel modelo = new DefaultTableModel(
            new String[]{"ID", "Hostname", "Dirección IP", "Tipo", "ID Proyecto"}, 0
        );
        String sql = "SELECT * FROM dispositivos";
        
        try (Connection cn = conectar();
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getInt("id"),         
                    rs.getString("hostname"), 
                    rs.getString("ip_address"), 
                    rs.getString("tipo"), 
                    rs.getInt("id_proyecto")
                });
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
        return modelo;
    }
public void registrarProyecto(String nombre, String estado, int idIngeniero) {
    // La fecha_creacion se llena sola gracias al current_timestamp() de tu DB
    String sql = "INSERT INTO proyectos (nombre, estado, id_ingeniero) VALUES (?, ?, ?)";
    
    try (Connection cn = conectar();
         PreparedStatement pst = cn.prepareStatement(sql)) {
        
        pst.setString(1, nombre);
        pst.setString(2, estado);
        pst.setInt(3, idIngeniero);
        
        pst.executeUpdate();
        javax.swing.JOptionPane.showMessageDialog(null, "Proyecto guardado exitosamente");
        
    } catch (SQLException e) {
        
        if (e.getErrorCode() == 1452) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: El ID de ingeniero no existe en la base de datos.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }
}
public String validarUsuario(int id, String pass) {
    String rolEncontrado = null;
  
    String sql = "SELECT rol FROM usuarios WHERE id = ? AND password = ?";
    
    try (Connection cn = conectar();
         PreparedStatement pst = cn.prepareStatement(sql)) {
        
        pst.setInt(1, id);
        pst.setString(2, pass);
        
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            rolEncontrado = rs.getString("rol");
        }
    } catch (SQLException e) {
        System.out.println("Error en login: " + e.getMessage());
    }
    return rolEncontrado; 
}

public void guardarChecklist(int idProy, boolean limpia, boolean vent, boolean cerrad) {
    String sql = "INSERT INTO checklist_gabinete (id_proyecto, limpieza, ventilacion, cerradura) VALUES (?, ?, ?, ?)";
    try (Connection cn = conectar();
         PreparedStatement pst = cn.prepareStatement(sql)) {
        
        pst.setInt(1, idProy);
        pst.setBoolean(2, limpia);
        pst.setBoolean(3, vent);
        pst.setBoolean(4, cerrad);
        
        pst.executeUpdate();
        javax.swing.JOptionPane.showMessageDialog(null, "Checklist guardado correctamente");
        
    } catch (SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error al guardar checklist: " + e.getMessage());
    }
}
public boolean guardarGabineteCheck(int idProy, boolean limpia, boolean vent, boolean cerrad) {
    String sql = "INSERT INTO checklist_gabinete (id_proyecto, limpieza, ventilacion, cerradura) VALUES (?, ?, ?, ?)";
    
    try (Connection cn = conectar(); 
         PreparedStatement pst = cn.prepareStatement(sql)) {
        
        pst.setInt(1, idProy);
        pst.setBoolean(2, limpia);
        pst.setBoolean(3, vent);
        pst.setBoolean(4, cerrad);
        
        int filas = pst.executeUpdate();
        return filas > 0;
        
    } catch (SQLException e) {
        if (e.getErrorCode() == 1452) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: El ID de proyecto no existe.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
        }
        return false;
    }
}

public boolean insertarFalla(int idProy, String desc, String prioridad) {
    String sql = "INSERT INTO tickets (id_proyecto, asunto, prioridad) VALUES (?, ?, ?)";
    
    try (Connection cn = conectar();
         PreparedStatement pst = cn.prepareStatement(sql)) {
        
        pst.setInt(1, idProy);
        pst.setString(2, desc);
        pst.setString(3, prioridad);
        
        int filas = pst.executeUpdate();
        return filas > 0;
        
    } catch (SQLException e) {
        if (e.getErrorCode() == 1452) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: El ID del proyecto no existe.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
        }
        return false;
    }
}

// Para la tabla de Fallas
public DefaultTableModel obtenerTablaFallas() {
    DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"ID Ticket", "ID Proyecto", "Asunto", "Prioridad", "Estado", "Fecha"});
    String sql = "SELECT * FROM tickets";
    try (Connection cn = conectar(); Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        String[] fila = new String[6];
        while (rs.next()) {
            fila[0] = rs.getString("id_ticket");
            fila[1] = rs.getString("id_proyecto");
            fila[2] = rs.getString("asunto");
            fila[3] = rs.getString("prioridad");
            fila[4] = rs.getString("estado");
            fila[5] = rs.getString("fecha_reporte");
            modelo.addRow(fila);
        }
    } catch (Exception e) { System.out.println(e); }
    return modelo;
}

// Para la tabla de Gabinetes
public DefaultTableModel obtenerTablaGabinetes() {
    DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Proyecto", "Limpieza", "Ventilación", "Cerradura", "Fecha"});
    String sql = "SELECT id_proyecto, limpieza, ventilacion, cerradura, fecha_revision FROM gabinete_check";
    try (Connection cn = conectar(); Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
        Object[] fila = new Object[5];
        while (rs.next()) {
            fila[0] = rs.getInt("id_proyecto");
            // Convertimos el 1/0 de la DB a SI/NO para que sea más legible
            fila[1] = rs.getInt("limpieza") == 1 ? "PASÓ" : "FALLÓ";
            fila[2] = rs.getInt("ventilacion") == 1 ? "PASÓ" : "FALLÓ";
            fila[3] = rs.getInt("cerradura") == 1 ? "PASÓ" : "FALLÓ";
            fila[4] = rs.getTimestamp("fecha_revision");
            modelo.addRow(fila);
        }
    } catch (Exception e) { System.out.println(e); }
    return modelo;
}

// Método para el botón RESOLVER (Cambia el estado del ticket)
public void resolverTicket(int id) {
    String sql = "UPDATE tickets SET estado = 'Resuelto' WHERE id_ticket = ?";
    try (Connection cn = conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {
        pst.setInt(1, id);
        pst.executeUpdate();
    } catch (Exception e) { System.out.println(e); }
}

}