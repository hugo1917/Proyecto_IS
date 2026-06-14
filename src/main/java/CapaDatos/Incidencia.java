package CapaDatos;

public class Incidencia {

   
    
    private String idIncidencia;
    private String descripcion;
    private String prioridad;

    public Incidencia(String idIncidencia, String descripcion, String prioridad) {
        this.idIncidencia = idIncidencia;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public boolean guardarIncidencia() {
        System.out.println("Guardando incidencia " + idIncidencia + " en la Base de Datos...");
        return true;
    }

    public String getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(String idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}