package moduloTareas;

public class NodoPila {
    private Tarea tarea;
    private NodoPila nodoSiguiente;
    
    public NodoPila(Tarea tarea) {
        this.tarea = tarea;
        this.nodoSiguiente = null;
    }
    
    public Tarea getTarea() {
        return tarea;
    }
    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
    public NodoPila getNodoSiguiente() {
        return nodoSiguiente;
    }
    public void setNodoSiguiente(NodoPila nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}