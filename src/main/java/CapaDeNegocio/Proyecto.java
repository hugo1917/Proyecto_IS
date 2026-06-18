package CapaDeNegocio;

import CapaDatos.Dispositivo;
import CapaDatos.Incidencia;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class Proyecto {

    private int idProyecto;
    private String nombre;
    private Date fechaCreacion;

    private List<Dispositivo> dispositivos;
    private List<Incidencia> incidencias;
    if (dispositivos == null) dispositivos = new ArrayList<>();


    public Proyecto(int idProyecto, String nombre) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaCreacion = new Date(); // Asigna la fecha actual del sistema
        this.dispositivos = new ArrayList<>();
        this.incidencias = new ArrayList<>();
    }

    public File generarReporte() {
        System.out.println("Compilando datos del proyecto: " + this.nombre);
        System.out.println("Extrayendo registros de " + dispositivos.size() + " dispositivos.");
        
        File reporte = new File("Reporte_" + idProyecto + ".pdf");
        return reporte;
    }

    public void agregarDispositivo(Dispositivo d) {
        this.dispositivos.add(d);
    }

   
    public void registrarIncidencia(Incidencia i) {
        this.incidencias.add(i);
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public List<Incidencia> getIncidencias() {
        return incidencias;
    }

    public String generarReporteTexto() {
    return "Proyecto: " + nombre +
           "\nDispositivos: " + dispositivos.size() +
           "\nIncidencias: " + incidencias.size();
}
    
}