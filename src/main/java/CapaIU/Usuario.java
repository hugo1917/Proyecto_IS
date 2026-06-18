package CapaIU;

public class Usuario {
    
    private String id;
    private String nombre;
    private String rol;

    
    public Usuario() {
    }

    public Usuario(String id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }

     
    public boolean login() {
        System.out.println("Iniciando proceso de autenticacion para: " + this.nombre);
        
        if (this.id != null && !this.id.isEmpty()) {
            System.out.println("Acceso concedido con el rol de: " + this.rol);
            return true;
        }
        
        System.out.println("Error de autenticacion: ID de usuario no válido.");
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario [ID=" + id + ", Nombre=" + nombre + ", Rol=" + rol + "]";
    }
}
