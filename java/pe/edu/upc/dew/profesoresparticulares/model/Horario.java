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
public class Horario {

    private Integer codHorario;
    private Integer codProfesor;
    private Integer codAlumno;
    private Date fecha;
    private Integer codHora;

    public Integer getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(Integer codAlumno) {
        this.codAlumno = codAlumno;
    }

    public Integer getCodHora() {
        return codHora;
    }

    public void setCodHora(Integer codHora) {
        this.codHora = codHora;
    }

    public Integer getCodHorario() {
        return codHorario;
    }

    public void setCodHorario(Integer codHorario) {
        this.codHorario = codHorario;
    }

    public Integer getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(Integer codProfesor) {
        this.codProfesor = codProfesor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}
