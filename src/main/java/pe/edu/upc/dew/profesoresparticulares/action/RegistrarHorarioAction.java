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
    private String dia;
    private String mes;
    private String anio;
    private String hora;
    private String lugar;
    private String costo;

    private RegistrarHorarioService service;

    public RegistrarHorarioService getService() {
        return service;
    }

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
        return SUCCESS;
    }

    public String borrarHorario(){
        System.out.println("ntra a borrar");
        return SUCCESS;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
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

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

}
