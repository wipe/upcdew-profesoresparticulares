/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.service.CursoService;
import pe.edu.upc.dew.profesoresparticulares.service.HoraService;
import pe.edu.upc.dew.profesoresparticulares.service.HorarioService;
import pe.edu.upc.dew.profesoresparticulares.service.UsuarioService;
import pe.edu.upc.dew.profesoresparticulares.util.Constantes;


public class ReservaHorarioAction  extends BaseAction{

    private String profesor;
    private String dia;
    private String mes;
    private String anho;

    private Long codHorarioReserva;

    private ArrayList<Usuario> profesoresList;

    public ArrayList<Usuario> getProfesoresList() {
        return profesoresList;
    }

    public void setProfesoresList(ArrayList<Usuario> profesoresList) {
        this.profesoresList = profesoresList;
    }

    private HorarioService horarioService;
    private CursoService cursoService;
    private HoraService horaService;
    private UsuarioService usuarioService;

    public void setCursoService(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void setHoraService(HoraService horaService) {
        this.horaService = horaService;
    }

    public void setHorarioService(HorarioService horarioService) {
        this.horarioService = horarioService;
    }

    public Long getCodHorarioReserva() {
        return codHorarioReserva;
    }

    public void setCodHorarioReserva(Long codHorarioReserva) {
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


    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String  buscarHorarioDisponibleProfesor(){
        List<Horario> registrarHorario = new ArrayList<Horario>();
        registrarHorario = horarioService.getProfesorHorarioDisponibles(profesor, dia, mes, anho);
        System.out.println("horarios encontrados:"+registrarHorario.size());
        System.out.println(" Action buscarHorarioDisponibleProfesor");
        getRequest().setAttribute("horariosDisponibles", registrarHorario);
        return SUCCESS;
    }

    public String reservarHorario(){
        System.out.println("Action Reservando usuario codigo de horario " + codHorarioReserva);

         Usuario objUsuario= (Usuario)getSession().getAttribute(Constantes.USUARIO);

        horarioService.reservarHorario(codHorarioReserva, objUsuario.getCodUsuario());

        return SUCCESS;

    }

    public String inicio(){
        profesoresList = usuarioService.getUsuarioProfesores();
        return SUCCESS;
    }

}
