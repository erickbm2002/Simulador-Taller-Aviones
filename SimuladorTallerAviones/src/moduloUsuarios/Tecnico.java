/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloUsuarios;

public class Tecnico extends Usuario {
    public Tecnico(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }
    
    // Método para identificar el rol
    public String getRol() {
        return "tecnico";
    }
}
