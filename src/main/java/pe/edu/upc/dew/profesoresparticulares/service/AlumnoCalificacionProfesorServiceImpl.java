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
public class AlumnoCalificacionProfesorServiceImpl implements AlumnoCalificacionProfesorService {

    private List<Calificacion> calificaciones = new ArrayList<Calificacion>();


    public AlumnoCalificacionProfesorServiceImpl(){
    }

    public void registrarCalificacion(Calificacion _calificacion) {
        calificaciones.add(_calificacion);
    }

    public ArrayList<Calificacion> listaCalificacionesAlumno(Integer codAlumno) {
         ArrayList<Calificacion> _calificaciones = new ArrayList<Calificacion>();

        for (Calificacion _c : calificaciones) {
            if (_c.getCodAlumno()!= null && _c.getCodAlumno() == codAlumno  ){
                _calificaciones.add(_c);
            }
        }
        return _calificaciones;
    }

     public ArrayList<Calificacion> listaCalificacionesProfesor(Integer codProfesor) {
       ArrayList<Calificacion> _calificaciones = new ArrayList<Calificacion>();

        for (Calificacion _c : calificaciones) {
            if (_c.getCodProfesor() == codProfesor  ){
                _calificaciones.add(_c);
            }
        }
        return _calificaciones;
    }
}
