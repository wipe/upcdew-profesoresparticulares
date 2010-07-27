/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.model;

/**
 *
 * @author synopsis
 */
public class Hora {

    private int clave;
    private String descripcion;

    public Hora() {
    }

    public Hora(int clave, String descripcion) {
        this.clave = clave;
        this.descripcion = descripcion;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

}
