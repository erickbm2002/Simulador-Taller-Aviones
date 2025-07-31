package mensajes;

public class MensajesSistema {

    public static void main(String[] args) {
        MensajesSistema mensajesSistema = new MensajesSistema();
        mensajesSistema.mensaje.append("Hola");
        System.out.println(mensajesSistema.mensaje.toString());
        mensajesSistema.limpiarMensaje();
        mensajesSistema.mensaje.append("Mensaje borrado");

    }

    public StringBuilder mensaje;

    public MensajesSistema() {
        this.mensaje.append("");
    }
    public void limpiarMensaje() {
        this.mensaje.delete(0, mensaje.length());
    }

    
}
