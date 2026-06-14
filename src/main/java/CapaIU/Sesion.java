package CapaIU;

public class Sesion {

    private static Sesion instancia;

    private String id;
    private String nombre;
    private String rol;

    private Sesion() {}

    public static Sesion getInstancia() {
        if (instancia == null) {
            instancia = new Sesion();
        }
        return instancia;
    }
}