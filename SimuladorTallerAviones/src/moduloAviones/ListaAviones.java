public class ListaAviones {
    private NodoLista inicio;

    public ListaAviones(NodoLista inicio) {
        this.inicio = null;
    }

    public Boolean esVacia() {
        if(this.inicio == null) {
            return true;
        }
        return false;
    }

    
}
