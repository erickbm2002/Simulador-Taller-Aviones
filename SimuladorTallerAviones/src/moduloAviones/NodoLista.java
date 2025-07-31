package moduloAviones;

public class NodoLista {
    private Avion avion;
    private NodoLista siguienteNodo;

    public NodoLista(Avion datoAvion) {
        this.avion = datoAvion;
        this.siguienteNodo = null;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public NodoLista getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(NodoLista siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    
}
