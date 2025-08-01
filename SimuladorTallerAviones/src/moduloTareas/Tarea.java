package moduloTareas;

public class Tarea {
    private String descripcion;
    private String estado;
    private int idTarea;
    
    public Tarea(int id, String descripcion) {
        this.idTarea = id;
        this.descripcion = descripcion;
        this.estado = "Pendiente";
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getIdTarea() {
        return idTarea;
    }
    
    @Override
    public String toString() {
        return "ID: " + idTarea + ", Descripción: " + descripcion + ", Estado: " + estado;
    }
}
