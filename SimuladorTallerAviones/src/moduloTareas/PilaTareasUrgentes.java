package moduloTareas;

import javax.swing.JOptionPane;

public class PilaTareasUrgentes {
    private NodoPila cabeza;
    
    public PilaTareasUrgentes() {
        this.cabeza = null;
    }
    
    public boolean esVacia() {
        return this.cabeza == null;
    }
    
    public void apilarTareaUrgente(Tarea tarea) {
        NodoPila nodoNuevo = new NodoPila(tarea);
        nodoNuevo.setNodoSiguiente(this.cabeza);
        this.cabeza = nodoNuevo;
    }
    
    public Tarea eliminarTareaUrgente() {
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "La pila de tareas urgentes está vacía.");
            return null;
        }
        Tarea tareaEliminada = this.cabeza.getTarea();
        this.cabeza = this.cabeza.getNodoSiguiente();
        return tareaEliminada;
    }
    
    public String mostrarTareasUrgentes() {
        if (esVacia()) {
            return "No hay tareas urgentes pendientes.";
        }
        StringBuilder sb = new StringBuilder("Tareas urgentes (cima a base):\n----------------------\n");
        NodoPila nodoActual = this.cabeza;
        while(nodoActual != null) {
            sb.append(nodoActual.getTarea().toString()).append("\n");
            nodoActual = nodoActual.getNodoSiguiente();
        }
        return sb.toString();
    }
}