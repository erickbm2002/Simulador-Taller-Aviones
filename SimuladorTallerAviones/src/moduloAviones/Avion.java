public class Avion {
    private String matricula;
    private String modelo;
    private String marca;
    private int capacidadPasajeros;
    private int anioFabricacion;
    //private ListaTareas listaTareas;

    public Avion(String matricula, String modelo, String marca, int capacidadPasajeros, int anioFabricacion /*ListaTareas listaTareas */) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion;
        /* this.listaTareas = listaTareas; */
    }

    @Override
    public String toString() {
        return "\nMatricula: " + getMatricula()
            +   "\nModelo: " + getModelo()
            +   "\nMarca: " + getMarca()
            +   "\nCapacidad de Pasajero: " + getCapacidadPasajeros()
            +   "\nAño de fabriación: " + getAnioFabricacion()
            /* +   "\nLista de tareas: " + "\n-----------------"
            +   "\n" + listaTareas.toString()
            +   "\n-----------------" */
            +   "\n-------------------------";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    

}
