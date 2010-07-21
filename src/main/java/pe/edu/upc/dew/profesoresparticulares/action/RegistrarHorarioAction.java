/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import pe.edu.upc.dew.profesoresparticulares.service.RegistrarHorarioService;
import pe.edu.upc.dew.profesoresparticulares.util.Constantes;

/**
 *
 * @author Wilder
 */
public class RegistrarHorarioAction extends BaseAction{

    private String curso;
    private String fecha;
    private String hora;
    private String lugar;
    private String costo;

    private RegistrarHorarioService service;

    public void setService(RegistrarHorarioService service) {
        this.service = service;
    }

    public RegistrarHorarioAction(RegistrarHorarioService registrarHorarioService) {
        this.service = registrarHorarioService;
    }

    public String inicio(){
        setRequest(Constantes.CURSOS, service.getCursos());
        return SUCCESS;
    }

    public String registrarHorario(){
        System.out.println("ntra a grabar");
        setRequest(Constantes.CURSOS, service.getCursos());
        return SUCCESS;
    }

    public String borrarHorario(){
        System.out.println("ntra a borrar");
        return SUCCESS;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


}
