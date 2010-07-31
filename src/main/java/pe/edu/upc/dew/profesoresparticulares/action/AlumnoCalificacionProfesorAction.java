/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.ArrayList;
import java.util.HashMap;
import pe.edu.upc.dew.profesoresparticulares.model.Calificacion;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
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
    private ArrayList<Usuario> profesoresList;
    private ArrayList<HashMap<String, String>> listaCalificaciones;

    public ArrayList<HashMap<String, String>> getListaCalificaciones() {
        return listaCalificaciones;
    }

    public void setListaCalificaciones(ArrayList<HashMap<String, String>> listaCalificaciones) {
        this.listaCalificaciones = listaCalificaciones;
    }

    private String profesor;
    private String comentario;
    private String cmbCalificaciones;

    public String getCmbCalificaciones() {
        return cmbCalificaciones;
    }

    public void setCmbCalificaciones(String cmbCalificaciones) {
        this.cmbCalificaciones = cmbCalificaciones;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    

    public AlumnoCalificacionProfesorService getAlumnoCalificacionservice() {
        return alumnoCalificacionservice;
    }

    public void setAlumnoCalificacionservice(AlumnoCalificacionProfesorService alumnoCalificacionservice) {
        this.alumnoCalificacionservice = alumnoCalificacionservice;
    }

    public ArrayList<Usuario> getProfesoresList() {
        return profesoresList;
    }

    public void setProfesoresList(ArrayList<Usuario> profesoresList) {
        this.profesoresList = profesoresList;
    }

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
        Usuario alumno = (Usuario)getSession().getAttribute(Constantes.USUARIO);
        int codAlumno = alumno.getCodUsuario();
        ArrayList<Horario> horarios = horarioService.getProfesorAlumno(codAlumno);
        profesoresList = new ArrayList<Usuario>();
        for (Horario horario : horarios) {
            profesoresList.add(usuarioService.getUsuario(horario.getCodProfesor()));
        }

        listaCalificaciones = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> xx = new HashMap<String, String>();
        xx.put("key", "1");
        listaCalificaciones.add(xx);
        xx = new HashMap<String, String>();
        xx.put("key", "2");
        listaCalificaciones.add(xx);
        xx = new HashMap<String, String>();
        xx.put("key", "3");
        listaCalificaciones.add(xx);
        
        return SUCCESS;
    }
    public String calificarProfesor(){
        Usuario alumno = (Usuario)getSession().getAttribute(Constantes.USUARIO);
        int codAlumno = alumno.getCodUsuario();
        ArrayList<Horario> horarios = horarioService.getProfesorAlumno(codAlumno);
        profesoresList = new ArrayList<Usuario>();
        for (Horario horario : horarios) {
            profesoresList.add(usuarioService.getUsuario(horario.getCodProfesor()));
        }

        Calificacion calificacion = new Calificacion();
        calificacion.setCalificacion(Integer.parseInt(cmbCalificaciones));
        calificacion.setCodProfesor(Integer.parseInt(profesor));
        calificacion.setComentario(comentario);
        calificacion.setCodAlumno(codAlumno);

        alumnoCalificacionservice.registrarCalificacion(calificacion);

        ArrayList<Calificacion> calificaciones = alumnoCalificacionservice.listaCalificacionesAlumno(codAlumno);

        getRequest().setAttribute("calificacionAlumno", calificaciones);
        
        return SUCCESS;
    }

}