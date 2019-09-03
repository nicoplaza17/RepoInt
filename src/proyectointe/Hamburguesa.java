/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointe;

/**
 *
 * @author nico
 */
public class Hamburguesa {
    private int precio;
    private String nombre;

    public Hamburguesa(String nombre,int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" + "precio=" + precio + ", nombre=" + nombre + '}';
    }

   

}

