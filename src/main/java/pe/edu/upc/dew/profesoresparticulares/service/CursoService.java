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
public interface CursoService {

    public ArrayList<Curso> getCursos();
    public Curso getCurso(Integer codCurso);

}
