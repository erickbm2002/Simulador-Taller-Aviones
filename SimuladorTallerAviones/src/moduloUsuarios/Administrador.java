/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloUsuarios;

public class Administrador extends Usuario {
    public Administrador(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }
    
    // Método para identificar el rol
    public String getRol() {
        return "administrador";
    }
}
