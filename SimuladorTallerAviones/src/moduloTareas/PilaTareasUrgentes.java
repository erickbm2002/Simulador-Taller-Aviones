package moduloTareas;

public class PilaTareasUrgentes {
    private NodoPila cabeza;

    public PilaTareasUrgentes() {
        this.cabeza = null;
    }

    public boolean apilarTareaUrgente (Tarea tarea) {
        NodoPila nodoNuevo = new NodoPila(tarea);
        if (esVacia()) {
            this.cabeza = nodoNuevo;
            return true;
        }
        this.cabeza.setNodoSiguiente(nodoNuevo);
        this.cabeza = nodoNuevo;
        return true;
    }

    public boolean eliminarTareaUrgente()  {
        NodoPila nodoActual = this.cabeza;
        this.cabeza = nodoActual.getNodoSiguiente();
        return true;
    }

    public String mostrarTareasUrgentes() {
        String datosTareasUrgentes = "Tareas urgentes: " + "\n----------------------";
        NodoPila nodoActual = this.cabeza; 
        while(nodoActual != null) {
            datosTareasUrgentes += nodoActual.getTarea().toString();
            nodoActual = nodoActual.getNodoSiguiente();
        }
        return datosTareasUrgentes;
    }

    public boolean esVacia() {
        if(this.cabeza == null) {
            return true;
        }
        return false;
    }

    
}
