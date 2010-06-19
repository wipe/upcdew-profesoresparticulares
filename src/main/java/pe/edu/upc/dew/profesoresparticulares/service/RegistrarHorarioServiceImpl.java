/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Curso;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;

/**
 *
 * @author Wilder
 */
public class RegistrarHorarioServiceImpl implements RegistrarHorarioService{
    
    List<Curso> cursos = new ArrayList<Curso>();
    List<Horario> horarios = new ArrayList<Horario>();

    public RegistrarHorarioServiceImpl(){
        Curso curso = new Curso();
        curso.setCodCurso(1);
        curso.setNomCurso("Matematica");
        cursos.add(curso);

        curso = new Curso();
        curso.setCodCurso(2);
        curso.setNomCurso("Programacion Web");
        cursos.add(curso);

        curso = new Curso();
        curso.setCodCurso(3);
        curso.setNomCurso("Inteligencia Artificial");
        cursos.add(curso);
    }

    public List<Curso> getCursos(){
        return cursos;
    }

    public List<Horario> registrarHorario() {
        Horario horario = new Horario();        
        return horarios;
    }



}
