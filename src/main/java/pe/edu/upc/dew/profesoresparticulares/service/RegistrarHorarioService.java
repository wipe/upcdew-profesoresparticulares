/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Curso;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;

/**
 *
 * @author Wilder
 */
public interface RegistrarHorarioService {

    public List<Curso> getCursos();
    public List<Horario> registrarHorario();

}
