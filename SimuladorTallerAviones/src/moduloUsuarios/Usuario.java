package moduloUsuarios;

// La clase Usuario debe ser abstracta
public abstract class Usuario {
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    // Este es el método abstracto que obliga a las clases hijas a implementarlo
    public abstract String getRol();
}