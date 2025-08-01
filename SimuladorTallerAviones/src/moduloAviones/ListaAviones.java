package moduloAviones;

public class ListaAviones {
    private NodoLista inicio;
    private NodoLista fin;

    public ListaAviones() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        return this.inicio == null;
    }
    
    public boolean agregarAvion(Avion nuevoAvion) {
        if (buscarAvion(nuevoAvion.getMatricula()) != null) {
            return false;
        }
        
        NodoLista nodoNuevo = new NodoLista(nuevoAvion);
        if (esVacia()) {
            this.inicio = nodoNuevo;
            this.fin = nodoNuevo;
        } else {
            this.fin.setSiguienteNodo(nodoNuevo);
            this.fin = nodoNuevo;
        }
        return true;
    }
    
    public String mostrarListaAviones() {
        if (esVacia()) {
            return "No hay aviones registrados en el taller.";
        }
        String datosAviones = "Aviones ingresados en el taller:\n-------------------------\n";
        NodoLista nodoActual = this.inicio;
        while (nodoActual != null) {
            datosAviones += nodoActual.getAvion().toString();
            nodoActual = nodoActual.getSiguienteNodo();
        }
        return datosAviones;
    }
    
    public boolean modificarDatosAvion(String matriculaOriginal, String nuevoModelo, String nuevaMarca, int nuevaCapacidad, int nuevoAnio) {
        NodoLista nodoAActualizar = buscarAvion(matriculaOriginal);
        if (nodoAActualizar != null) {
            nodoAActualizar.getAvion().setModelo(nuevoModelo);
            nodoAActualizar.getAvion().setMarca(nuevaMarca);
            nodoAActualizar.getAvion().setCapacidadPasajeros(nuevaCapacidad);
            nodoAActualizar.getAvion().setAnioFabricacion(nuevoAnio);
            return true;
        }
        return false;
    }
    
    public boolean eliminarAvion(String matriculaAvion) {
        if (esVacia()) {
            return false;
        }

        if (this.inicio.getAvion().getMatricula().equals(matriculaAvion)) {
            this.inicio = this.inicio.getSiguienteNodo();
            if (this.inicio == null) {
                this.fin = null;
            }
            return true;
        }

        NodoLista nodoActual = this.inicio;
        while (nodoActual.getSiguienteNodo() != null && !nodoActual.getSiguienteNodo().getAvion().getMatricula().equals(matriculaAvion)) {
            nodoActual = nodoActual.getSiguienteNodo();
        }

        if (nodoActual.getSiguienteNodo() != null) {
            nodoActual.setSiguienteNodo(nodoActual.getSiguienteNodo().getSiguienteNodo());
            if (nodoActual.getSiguienteNodo() == null) {
                this.fin = nodoActual;
            }
            return true;
        }

        return false;
    }
    
    public NodoLista buscarAvion(String matriculaAvion) {
        NodoLista nodoActual = this.inicio;
        while (nodoActual != null) {
            if (nodoActual.getAvion().getMatricula().equals(matriculaAvion)) {
                return nodoActual;
            }
            nodoActual = nodoActual.getSiguienteNodo();
        }
        return null;
    }
}