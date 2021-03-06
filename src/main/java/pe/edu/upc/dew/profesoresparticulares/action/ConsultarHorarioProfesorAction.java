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

/**
 *
 * @author Wilder
 */
public class ConsultarHorarioProfesorAction extends BaseAction{

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

    public String inicio(){
        System.out.println();
        Usuario profesor = (Usuario)getSession().getAttribute(Constantes.USUARIO);
        System.out.println(profesor.getCodUsuario()+"=profesor");
        ArrayList<Horario> horarios = horarioService.getHorarioProfesor(profesor.getCodUsuario());
        getRequest().setAttribute("horariosProfesor", horarios);
        
        return SUCCESS;
    }

}
