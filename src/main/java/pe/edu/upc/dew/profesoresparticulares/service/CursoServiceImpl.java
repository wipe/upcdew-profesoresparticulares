 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import pe.edu.upc.dew.profesoresparticulares.dao.CursoDao;
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
        CursoDao cursoDao = new CursoDao();
        return cursoDao.getCursos();
    }

    public Curso getCurso(Integer codCurso) {
       CursoDao cursoDao = new CursoDao();
        return cursoDao.getCurso(codCurso);
    }



}
