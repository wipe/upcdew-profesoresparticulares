/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import pe.edu.upc.dew.profesoresparticulares.service.HorarioService;

/**
 *
 * @author DUOTRABAJO
 */
public class ReservaHorarioAction  extends BaseAction{

    private String profesor;
    private String dia;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }


    private String mes;
    private String anho;

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }


    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }


    private HorarioService service;

    public void setService(HorarioService service) {
        this.service = service;
    }

    public ReservaHorarioAction(HorarioService horarioService) {
        this.service = horarioService;
    }


    public String  buscarHorarioDisponibleProfesor(){

        System.out.println(anho + "-" + mes + "-" + dia + " fecha");

        System.out.println(profesor + " profesor buscarHorarioDisponibleProfesor");

        return SUCCESS;
    }

}
