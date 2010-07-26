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

        registrarCalificacion(1,1,"01/02/2010",5,"Excelente el profesor");
        registrarCalificacion(1,2,"05/02/2010",2,"Malo el profesor");
        registrarCalificacion(2,2,"05/03/2010",3,"Mas o menos el profesor");


    }

    public void registrarCalificacion(Integer codAlumno, Integer codProfesor, String fecha, Integer calificacion, String comentario) {

        Calificacion _calificacion = new Calificacion();
        _calificacion.setCodProfesor(codAlumno);
        _calificacion.setCodAlumno(codProfesor);
        _calificacion.setFecha(fecha);
        _calificacion.setCalificacion(calificacion);
        _calificacion.setComentario(comentario);
        calificaciones.add(_calificacion);
        

    }

    public List<Calificacion> listaCalificacionesAlumno(Integer codAlumno) {
         List<Calificacion> _calificaciones = new ArrayList<Calificacion>();

        for (Calificacion _c : calificaciones) {
            if (_c.getCodAlumno() == codAlumno  ){
                _calificaciones.add(_c);
            }
        }
        return _calificaciones;
    }

     public List<Calificacion> listaCalificacionesProfesor(Integer codProfesor) {
       List<Calificacion> _calificaciones = new ArrayList<Calificacion>();

        for (Calificacion _c : calificaciones) {
            if (_c.getCodProfesor() == codProfesor  ){
                _calificaciones.add(_c);
            }
        }
        return _calificaciones;
    }
}
