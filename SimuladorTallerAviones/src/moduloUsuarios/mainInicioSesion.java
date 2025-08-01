package moduloUsuarios;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class mainInicioSesion {
    
    // La lista se mantiene como tipo Usuario
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        inicializarUsuarios();

        boolean sesionIniciada = false;
        while (!sesionIniciada) {
            String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");
            String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

            Usuario usuarioAutenticado = validarCredenciales(nombreUsuario, contrasena);

            if (usuarioAutenticado != null) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido, " + usuarioAutenticado.getNombreUsuario() + "!");
                JOptionPane.showMessageDialog(null, "Rol: " + usuarioAutenticado.getRol());
                sesionIniciada = true;
                
                switch (usuarioAutenticado.getRol()) {
                    case "administrador":
                        JOptionPane.showMessageDialog(null, "Cargando menú de administrador...");
                        break;
                    case "tecnico":
                        JOptionPane.showMessageDialog(null, "Cargando menú de técnico...");
                        break;
                    case "cliente":
                        JOptionPane.showMessageDialog(null, "Cargando menú de cliente...");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Rol no reconocido.");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Intente de nuevo.");
            }
        }
    }

    private static void inicializarUsuarios() {
        // CORRECTO: Usar las clases hijas para instanciar objetos
        usuarios.add(new Administrador("admin", "admin123")); 
        usuarios.add(new Tecnico("tecnico1", "tec123"));       
        usuarios.add(new Cliente("cliente1", "cli123"));        
    }
    
    private static Usuario validarCredenciales(String nombreUsuario, String contrasena) {
        if (nombreUsuario == null || contrasena == null) {
            return null;
        }

        for (Usuario u : usuarios) {
            if (u.getNombreUsuario().equals(nombreUsuario) && u.getContrasena().equals(contrasena)) {
                return u;
            }
        }
        return null;
    }
}