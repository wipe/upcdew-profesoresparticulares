/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;

/**
 *
 * @author DUOTRABAJO
 */


public interface ConsultaHorarioProfesorService {


      public List<Horario> getHorarioProfesor(int codProfesor) ;

}
