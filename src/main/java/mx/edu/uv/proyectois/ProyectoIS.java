package mx.edu.uv.proyectois;

// Importaciones de las diferentes capas según la estructura de paquetes
import CapaDatos.Dispositivo;
import CapaDatos.Incidencia;
import CapaDeNegocio.CalculadoraCampo;
import CapaDeNegocio.GestorRed;
import CapaDeNegocio.Proyecto;
import CapaIU.Usuario;
import Integración.ApiExterna;

import java.util.Arrays;
import java.util.List;

public class ProyectoIS {

    public static void main(String[] args) {
        ApiExterna servicios = new ApiExterna();
        
        Usuario usuarioActual = new Usuario("UV-2026", "Ing. Hugo Fraid", "Ingeniero de Redes");
        
        System.out.println("======= NETCALC PRO: SISTEMA DE INGENIERÍA =======");
        if (usuarioActual.login()) {
            System.out.println("Autenticación exitosa vía Directorio Activo.");

            Proyecto miProyecto = new Proyecto(101, "Despliegue Red Campus");
            System.out.println("\nTrabajando en: " + miProyecto.getNombre());

            // 4. Lógica de Ingeniería (CapaDeNegocio.GestorRed)
            GestorRed gestor = new GestorRed();
            List<Integer> hostsPorSubred = Arrays.asList(100, 50, 25, 2);
            
            System.out.println("Calculando direccionamiento VLSM...");
            gestor.calcularVLSM("172.16.0.0", hostsPorSubred);

            Dispositivo routerCore = new Dispositivo(
                "Core-MX", 
                "172.16.0.1", 
                "AA:BB:CC:DD:EE:FF", 
                "Operacional"
            );
            miProyecto.agregarDispositivo(routerCore);

            CalculadoraCampo calculadora = new CalculadoraCampo();
            String diagnostico = calculadora.verificarConectividad("172.16.0.1");
            System.out.println("\nResultado de diagnóstico: " + diagnostico);

            float perdidaSignal = calculadora.calcularAtenuacion(120.5f, "Fibra Óptica");
            System.out.println("Validación física: Pérdida calculada de " + perdidaSignal + " dB");

            if (perdidaSignal > 2.0) { 
                Incidencia falla = new Incidencia("ERR-01", "Atenuación excedida en enlace A", "Alta");
                if (falla.guardarIncidencia()) {
                    miProyecto.registrarIncidencia(falla);
                    System.out.println("Incidencia registrada y vinculada al proyecto.");
                }
            }

            System.out.println("\nGenerando documentación técnica final...");
            miProyecto.generarReporte();
            
            System.out.println("==================================================");
            System.out.println("Estado final del sistema: LISTO.");
            
        } else {
            System.err.println("Error: Acceso denegado. Verifique su conexión con el servidor AD.");
        }
    }
}