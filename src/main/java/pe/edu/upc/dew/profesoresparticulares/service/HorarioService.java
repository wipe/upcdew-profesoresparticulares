/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Curso;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
/**
 * 
 * @author Wilder
 */
public interface HorarioService {

    public ArrayList<Curso> getCursos();
    public ArrayList<Horario> getregistroHorario();

    public void registrarHorario(Horario horario);


    public ArrayList<Horario> getHorarioProfesor(int codProfesor) ;

    public ArrayList<Horario> getProfesorAlumno(int codAlumno) ;


    public ArrayList<Horario> getProfesorHorarioDisponibles(int codProfesor, String fecha);
    public List<Horario> reservarHorario(Long codHora, Integer codAlumno, String nombreAlumno);

    public Horario getHorario(Horario horario);

    public List<Horario> getProfesorHorarioDisponibles(String dia, String mes, String anho);
    public List<Horario> getProfesorHorarioDisponibles(String profesor, String dia, String mes, String anho);


}
