/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author HDRESDA
 */
public class AlumnoClasificacionProfesorServiceImpl implements AlumnoClasificacionProfesorService {

    private List<Usuario> profesores = new ArrayList<Usuario>();

     public List<Usuario> getUsuarioProfesores() {
         return profesores;
     }
    public void actualizarCalificacion(Integer codAlumno, Integer codProfesor, Integer calificacion, String comentario){

    }
    
}
