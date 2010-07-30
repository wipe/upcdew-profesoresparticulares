/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import pe.edu.upc.dew.profesoresparticulares.model.Curso;
import pe.edu.upc.dew.profesoresparticulares.model.Hora;
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

public class RegistrarHorarioAction extends BaseAction{

    private String curso;
    private String fecha;
    private String hora;
    private String lugar;
    private String costo;
    private String horaInicio;
    private String horas;

    private ArrayList<Hora> horaList;
    private ArrayList<Hora> horasList;
    private ArrayList<Curso> cursos;
    

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

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
        cursos =  cursoService.getCursos();
        horaList = horaService.getHoras();

        horasList = new ArrayList<Hora>();
        horasList.add(new Hora(1,"1"));
        horasList.add(new Hora(2,"2"));
        horasList.add(new Hora(3,"3"));
        horasList.add(new Hora(4,"4"));

        setRequest(Constantes.HORARIO, new ArrayList<Horario>());
        
        return SUCCESS;
    }

    public String registrarHorario(){
        cursos =  cursoService.getCursos();
         horaList = horaService.getHoras();

        horasList = new ArrayList<Hora>();
        horasList.add(new Hora(1,"1"));
        horasList.add(new Hora(2,"2"));
        horasList.add(new Hora(3,"3"));
        horasList.add(new Hora(4,"4"));
        
        Horario horario = null;
        ArrayList<Horario> horarios = new ArrayList<Horario>();
        Usuario usuario = (Usuario)getSession().getAttribute(Constantes.USUARIO);

        System.out.println(horas);

        int i = Integer.parseInt(horas);
        int horaInicio = Integer.parseInt(hora);
        for(int o=0; o<i; o++){
            horario = new Horario();
            GregorianCalendar d = new GregorianCalendar();
            horario.setCodHorario(d.getTimeInMillis()+o);
            
            horario.setCodCurso(Integer.parseInt(curso));
            horario.setNomCurso(cursoService.getCurso(Integer.parseInt(curso)).getNomCurso());

            horario.setFecha(fecha);
            horario.setLugar(lugar);
            horario.setCosto(Integer.parseInt(costo));

            horario.setHora(horaInicio);
            horario.setDescHora(horaService.getHora(horaInicio).getDescripcion());

            horario.setCodProfesor(usuario.getCodUsuario());
            horario.setNomProfesor(usuario.toString());

            if(horarioService.getHorario(horario)==null){
                horarioService.registrarHorario(horario);
            }else{
                LOG.error("horario duplicado");
            }
            if(horaInicio+i>24){
                break;
            }
            horaInicio++;
            horarios.add(horario);
        }
        
        setRequest(Constantes.CURSOS, cursoService.getCursos());
        setRequest(Constantes.HORARIO, horarios);

        return SUCCESS;
    }

    public String borrarHorario(){
        return SUCCESS;
    }
    
    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public ArrayList<Hora> getHoraList() {
        return horaList;
    }

    public void setHoraList(ArrayList<Hora> horaList) {
        this.horaList = horaList;
    }

    public ArrayList<Hora> getHorasList() {
        return horasList;
    }

    public void setHorasList(ArrayList<Hora> horasList) {
        this.horasList = horasList;
    }

}
