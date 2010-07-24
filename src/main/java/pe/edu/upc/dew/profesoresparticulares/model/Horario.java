/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.model;

/**
 *
 * @author Wilder
 */
public class Horario {

    private Integer codHorario;
    private Integer codProfesor;
    private Integer codAlumno;
    private String fecha;
    private String hora;
    private String lugar;
    private Integer codCurso;
    private Integer costo;

    private String nombreAlumno;


    public Horario(){
        
    }

    public Integer getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(Integer codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

     public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }


}
