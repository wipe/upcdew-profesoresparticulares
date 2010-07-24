/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.ArrayList;
import pe.edu.upc.dew.profesoresparticulares.model.Hora;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.service.HorarioService;
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

    private HorarioService service;

    public void setService(HorarioService service) {
        this.service = service;
    }

    public RegistrarHorarioAction(HorarioService horarioService) {
        this.service = horarioService;
    }

    public String inicio(){
        setRequest(Constantes.CURSOS, service.getCursos());
        setRequest(Constantes.HORARIO, new ArrayList<Horario>());
        horaList = new ArrayList<Hora>();
        horaList.add(new Hora("1","08:00"));

        horasList = new ArrayList<Hora>();
        horasList.add(new Hora("1","1"));
        
        return SUCCESS;
    }

    public String registrarHorario(){
        Horario horario = null;
        Usuario usuario = (Usuario)getSession().getAttribute(Constantes.USUARIO);

        System.out.println(fecha);
        System.out.println(":"+hora+":");
        System.out.println(":"+horas+":");



        int i = 0;
        /*while(i<=getHoras()){
            horario = new Horario();
            horario.setCodCurso(getCurso());
            horario.setFecha(fecha);
            horario.setLugar(lugar);
            horario.setCosto(Integer.parseInt(costo));
            horario.setHora(hora);
            horario.setCodProfesor(usuario.getCodUsuario());
            service.registrarHorario(horario);
            i++;
        }*/
        
        setRequest(Constantes.CURSOS, service.getCursos());
        setRequest(Constantes.HORARIO, horario);
        return SUCCESS;
    }

    public String borrarHorario(){
        System.out.println("ntra a borrar");
        return SUCCESS;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public Integer getCurso() {
        return Integer.parseInt(curso);
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
