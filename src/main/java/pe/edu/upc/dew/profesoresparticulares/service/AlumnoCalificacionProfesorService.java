/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Calificacion;

/**
 *
 * @author HDRESDA
 */
public interface AlumnoCalificacionProfesorService {

    //public List<Usuario> getUsuarioProfesores() ;
    public void registrarCalificacion(Calificacion calificacion);
    public ArrayList<Calificacion> listaCalificacionesAlumno(Integer codAlumno);
    public ArrayList<Calificacion> listaCalificacionesProfesor(Integer codProfesor);


}
