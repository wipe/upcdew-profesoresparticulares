/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.service.AlumnoCalificacionProfesorService;
import pe.edu.upc.dew.profesoresparticulares.service.HorarioService;
import pe.edu.upc.dew.profesoresparticulares.service.UsuarioService;
import pe.edu.upc.dew.profesoresparticulares.util.Constantes;

/**
 *
 * @author HDRESDA
 */
public class AlumnoCalificacionProfesorAction extends BaseAction {

    private AlumnoCalificacionProfesorService alumnoCalificacionservice;
    private UsuarioService usuarioService;
    private HorarioService horarioService;

    public void setAlumnoClasificacionservice(AlumnoCalificacionProfesorService alumnoCalificacionservice) {
        this.alumnoCalificacionservice = alumnoCalificacionservice;
    }

    public void setHorarioService(HorarioService horarioService) {
        this.horarioService = horarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


     public AlumnoCalificacionProfesorAction(AlumnoCalificacionProfesorService alumnoCalificacionProfesorService,
             UsuarioService usuarioService,
             HorarioService horarioService
             ) {
        this.alumnoCalificacionservice = alumnoCalificacionProfesorService;
        this.usuarioService = usuarioService;
        this.horarioService = horarioService;
    }

    public String inicio(){
        System.out.println("ntra a inicio de alumno calificacion profesor");
        Usuario alumno = (Usuario)getSession().getAttribute(Constantes.USUARIO);
        int codAlumno = alumno.getCodUsuario();
        List<Usuario> profesores = horarioService.getProfesorAlumno(codAlumno);
        for (Usuario usuario : profesores) {
            usuario = (Usuario) usuarioService.getUsuario(usuario.getCodUsuario());
        }

        for (Usuario usuario : profesores) {
            System.out.print("nombre "+usuario.getNomUsuario());
        }

        
        return SUCCESS;
    }
    public String actualizarCalificacion(){

        System.out.println("Registrar Calificacion");
        return SUCCESS;
    }



}
