 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import pe.edu.upc.dew.profesoresparticulares.model.Curso;

/**
 *
 * @author synopsis
 */
public class CursoServiceImpl implements CursoService{
    
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

    public CursoServiceImpl() {
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

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public Curso getCurso(Integer codCurso) {
        for (Curso curso : cursos) {
            if(curso.getCodCurso()==codCurso){
                return curso;
            }
        }
        return new Curso();
    }



}
