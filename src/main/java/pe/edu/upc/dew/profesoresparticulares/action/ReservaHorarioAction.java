/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.service.HorarioService;


public class ReservaHorarioAction  extends BaseAction{

    private Integer profesor;
    private String dia;
    private String mes;
    private String anho;

    private Integer codHorarioReserva;

    public Integer getCodHorarioReserva() {
        return codHorarioReserva;
    }

    public void setCodHorarioReserva(Integer codHorarioReserva) {
        this.codHorarioReserva = codHorarioReserva;
    }


    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

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


    public Integer getProfesor() {
        return profesor;
    }

    public void setProfesor(Integer profesor) {
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

         List<Horario> registrarHorario;

         registrarHorario = service.getProfesorHorarioDisponibles( profesor ,anho + "-" + mes + "-" + dia);

          System.out.println("horarios disponibles " + registrarHorario.size());

          getRequest().setAttribute("horariosDisponibles", registrarHorario);

        return SUCCESS;
    }

    public String reservarHorario(){
        System.out.println("Action Reservando usuario codigo de horario" + codHorarioReserva);

        return SUCCESS;

    }

}
