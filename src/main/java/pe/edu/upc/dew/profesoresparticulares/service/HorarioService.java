/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Curso;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
/**
 *
 * @author Wilder
 */
public interface HorarioService {

    public List<Curso> getCursos();
    public List<Horario> registrarHorario();

    public void registrarHorario(Horario horario);


    public List<Horario> getHorarioProfesor(int codProfesor) ;

    public List<Usuario> getProfesorAlumno(int codAlumno) ;


    public List<Horario> getProfesorHorarioDisponibles(int codProfesor, String fecha);
    public void reservarHorario(Integer codHora, Integer codAlumno);


}
