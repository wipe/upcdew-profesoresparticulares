/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author HDRESDA
 */
public interface AlumnoClasificacionProfesorService {

    public List<Usuario> getUsuarioProfesores() ;
    public void actualizarCalificacion(Integer codAlumno, Integer codProfesor, Integer calificacion, String comentario);


}
