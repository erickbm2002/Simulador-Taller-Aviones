/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloTareas;

public class NodoTarea {
    Tarea tarea;
    NodoTarea siguiente;

    public NodoTarea(Tarea tarea) {
        this.tarea = tarea;
        this.siguiente = null;
    }
}
