/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.ArrayList;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.service.CursoService;
import pe.edu.upc.dew.profesoresparticulares.service.HoraService;
import pe.edu.upc.dew.profesoresparticulares.service.HorarioService;
import pe.edu.upc.dew.profesoresparticulares.service.UsuarioService;
import pe.edu.upc.dew.profesoresparticulares.util.Constantes;


public class AlumnoConsultaHorarioAction extends BaseAction{

    private HorarioService horarioService;
    private Long codHorarioReserva;
    private CursoService cursoService;
    private HoraService horaService;
    private UsuarioService usuarioService;


    public Long getCodHorarioReserva() {
        return codHorarioReserva;
    }

    public void setCodHorarioReserva(Long codHorarioReserva) {
        this.codHorarioReserva = codHorarioReserva;
    }

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




    public String inicio(){
        System.out.println("inicio de Alumno Consulta Horario");
        Usuario profesor = (Usuario)getSession().getAttribute(Constantes.USUARIO);
        System.out.println(profesor.getCodUsuario()+"=profesor");
        ArrayList<Horario> horarios = horarioService.getregistroHorario();
        getRequest().setAttribute("horariosReservados", horarios);

        return SUCCESS;
    }

     public String borrarReserva(){

        horarioService.cancelarReserva(codHorarioReserva);
        ArrayList<Horario> horarios = horarioService.getregistroHorario();
        getRequest().setAttribute("horariosReservados", horarios);


       System.out.println("Action borrando Reserva " + codHorarioReserva);

          return SUCCESS;
     }

}
