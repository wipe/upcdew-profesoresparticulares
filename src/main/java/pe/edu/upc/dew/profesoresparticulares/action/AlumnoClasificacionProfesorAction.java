/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.service.AlumnoClasificacionProfesorService;
import pe.edu.upc.dew.profesoresparticulares.service.UsuarioService;

/**
 *
 * @author HDRESDA
 */
public class AlumnoClasificacionProfesorAction extends BaseAction {

    private AlumnoClasificacionProfesorService service;
    private UsuarioService usuarioService;


     public AlumnoClasificacionProfesorAction(AlumnoClasificacionProfesorService alumnoClasificacionProfesorService,UsuarioService usuarioService) {
        this.service = alumnoClasificacionProfesorService;
        this.usuarioService = usuarioService;
    }

    public String getUsuarioProfesores(){
        List<Usuario> usuario = usuarioService.getUsuarioProfesores();
        System.out.print("tamaño"+usuario.size());
        return SUCCESS;
    }
    public String actualizarCalificacion(){

        System.out.println("Registrar Calificacion");
        return SUCCESS;
    }



}
