/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Calificacion;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author HDRESDA
 */
public interface AlumnoCalificacionProfesorService {

    //public List<Usuario> getUsuarioProfesores() ;
    public void registrarCalificacion(Integer codAlumno, Integer codProfesor,String fecha, Integer calificacion, String comentario);
    public List<Calificacion> listaCalificacionesAlumno(Integer codAlumno);
    public List<Calificacion> listaCalificacionesProfesor(Integer codProfesor);


}
