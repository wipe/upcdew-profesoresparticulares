/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.model;

import java.util.Date;

/**
 *
 * @author Wilder
 */
public class Calificacion {

    private Integer codAlumno;
    private Integer codProfesor;
    private Integer calificacion;
    private String comentario;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(Integer codAlumno) {
        this.codAlumno = codAlumno;
    }

    public Integer getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(Integer codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
