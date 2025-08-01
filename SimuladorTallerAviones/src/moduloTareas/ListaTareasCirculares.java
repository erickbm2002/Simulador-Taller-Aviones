package moduloTareas;

public class ListaTareasCirculares {
    private NodoTarea cabeza;
    private int tamano;

    public ListaTareasCirculares() {
        this.cabeza = null;
        this.tamano = 0;
    }
    
    public boolean estaVacia() {
        return cabeza == null;
    }
    
    public void agregarTarea(Tarea nuevaTarea) {
        NodoTarea nuevoNodo = new NodoTarea(nuevaTarea);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;
        } else {
            NodoTarea actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
        tamano++;
    }
    
    public boolean eliminarTarea(int idTarea) {
        if (estaVacia()) {
            return false;
        }

        NodoTarea actual = cabeza;
        NodoTarea anterior = null;
        
        if (cabeza.tarea.getIdTarea() == idTarea) {
            if (tamano == 1) {
                cabeza = null;
            } else {
                while (actual.siguiente != cabeza) {
                    actual = actual.siguiente;
                }
                actual.siguiente = cabeza.siguiente;
                cabeza = cabeza.siguiente;
            }
            tamano--;
            return true;
        }
        
        do {
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza && actual.tarea.getIdTarea() != idTarea);
        
        if (actual.tarea.getIdTarea() == idTarea) {
            anterior.siguiente = actual.siguiente;
            tamano--;
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        if (estaVacia()) {
            return "No hay tareas para este avión.";
        }
        StringBuilder sb = new StringBuilder();
        NodoTarea actual = cabeza;
        do {
            sb.append(actual.tarea.toString()).append("\n");
            actual = actual.siguiente;
        } while (actual != cabeza);
        return sb.toString();
    }
}