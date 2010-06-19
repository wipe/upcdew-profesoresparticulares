/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;



public class ConsultaHorarioProfesorImpl  implements ConsultaHorarioProfesorService{

     private List<Horario> HorarioProfesor = new ArrayList<Horario>();

    public ConsultaHorarioProfesorImpl(){
        Horario objHorario1 = new Horario();
        objHorario1.setCodHorario(1);
        objHorario1.setCodProfesor(1);
        objHorario1.setCodHora(1);
        objHorario1.setFecha(new Date("01-06-2010"));
        objHorario1.setCodAlumno(0);
        HorarioProfesor.add(objHorario1);

        Horario objHorario2 = new Horario();
        objHorario2.setCodHorario(2);
        objHorario2.setCodProfesor(1);
        objHorario2.setCodHora(2);
        objHorario2.setFecha(new Date("01-06-2010"));
        objHorario2.setCodAlumno(0);
        HorarioProfesor.add(objHorario1);

    }

      public List<Horario> getHorarioProfesor(int codProfesor) {
          return HorarioProfesor;
      }

}
