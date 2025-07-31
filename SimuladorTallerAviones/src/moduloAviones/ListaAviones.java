package moduloAviones;



public class ListaAviones {

    public static void main(String[] args) {
        Avion avion =  new Avion("1234", "sKYLE", null, 0, 0);
        ListaAviones lista = new ListaAviones();
        System.out.println(lista.agregarAvion(avion));
        Avion avion2 =  new Avion("12", null, null, 0, 0);
        System.out.println(lista.agregarAvion(avion2));
        Avion avion3 =  new Avion("12345", null, null, 0, 0);
        System.out.println(lista.agregarAvion(avion3));
        System.out.println(lista.mostrarListaAviones());
        NodoLista nodoAactualizar =lista.buscarAvion("1234");
        lista.modificarDatosAvion(nodoAactualizar, "145842", "sKYLE", 100, 0);
        System.out.println("****************************");
        System.out.println(lista.mostrarListaAviones());
        

    }

    private NodoLista inicio;
    private NodoLista fin;

    public ListaAviones() {
        this.inicio = null;
        this.fin = null;
    }

    ///CRUD
    /// CREATE
    /// READ
    /// UPTADE
    /// DELETE

    //CREATE
    public boolean agregarAvion(Avion nuevoAvion) {
        NodoLista nodoNuevo = new NodoLista(nuevoAvion);
        if(esVacia()) {
            this.inicio = nodoNuevo;
            this.fin = nodoNuevo;
            
        }
        this.fin.setSiguienteNodo(nodoNuevo);
        this.fin = nodoNuevo;
        return true;
    }

    //READ
    public String mostrarListaAviones() {
        String datosAviones = "Aviones ingresados en el taller:" + "\n-------------------------";
        NodoLista nodoActual = this.inicio;
        while(nodoActual != null) {
            datosAviones += nodoActual.getAvion().toString();
            nodoActual = nodoActual.getSiguienteNodo();
        }
        return datosAviones;
    }

    //UPDATE
    public boolean modificarDatosAvion(NodoLista nodoAActualizar, String matriculaActualizada, String modeloActualiado, int capacidadPasajerosModificado, int anioFabricacionActualizado) {
        if(nodoAActualizar != null) {
            nodoAActualizar.getAvion().setMatricula(matriculaActualizada);
            nodoAActualizar.getAvion().setModelo(modeloActualiado);
            nodoAActualizar.getAvion().setCapacidadPasajeros(capacidadPasajerosModificado);
            nodoAActualizar.getAvion().setAnioFabricacion(anioFabricacionActualizado);
            insertarNodoActualizado(nodoAActualizar);
            //Se usa operador ternario para validar si se actualizó el avion en el nodo
            Boolean estaActualizado = (insertarNodoActualizado(nodoAActualizar)) ? true : false;
            return estaActualizado;
        }
        
        return false;
    }

    //DELETE
    public boolean eliminarAvion(String matriculaAvion) {
        if(esVacia()) {
            return false;
        }
        //validamos si es el primero nodo que vamos a eliminar
        if(this.inicio.getAvion().getMatricula().equals(matriculaAvion)) {
            this.inicio = this.inicio.getSiguienteNodo();
            return true;
        }
        //En caso que no sea el primero vamos a recorrer los nodos
        NodoLista nodoActual = this.inicio;

        while(nodoActual != null) {
            if(nodoActual.getSiguienteNodo().getAvion().getMatricula().equals(matriculaAvion)) {
                NodoLista nodoEliminado = nodoActual.getSiguienteNodo();
                nodoActual.setSiguienteNodo(nodoEliminado.getSiguienteNodo());
                return true;
            }
            nodoActual = nodoActual.getSiguienteNodo();
        }

        return false;

    }

    public NodoLista buscarAvion(String matriculaAvion) {
        NodoLista nodoActual = this.inicio;
        while(nodoActual != null) {
            if(nodoActual.getAvion().getMatricula().equals(matriculaAvion)) {
                return nodoActual;
            }
        }
        return null;
    }

    public boolean insertarNodoActualizado(NodoLista nodoActualizado) {
        NodoLista nodoActual = this.inicio;
        while(nodoActual != null) {
            if(nodoActualizado == nodoActual) {
                nodoActual = nodoActualizado;
            }
            nodoActual = nodoActual.getSiguienteNodo();
        }
        return false;
    }

    public Boolean esVacia() {
        if(this.inicio == null) {
            return true;
        }
        return false;
    }

    
}
