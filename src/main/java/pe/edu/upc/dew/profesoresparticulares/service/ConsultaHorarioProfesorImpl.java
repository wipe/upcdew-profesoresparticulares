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

     private List<Horario> horarioProfesor = new ArrayList<Horario>();

    public ConsultaHorarioProfesorImpl(){

         System.out.println("Agregando primer horario");
        Horario objHorario1 = new Horario();
         System.out.println("instanciado");
        objHorario1.setCodHorario(1);
        System.out.println("codHorario");
        objHorario1.setCodProfesor(2);
         System.out.println("codProfesor");
        objHorario1.setCodHora(1);
             System.out.println("codHora");
        objHorario1.setLugar("UPC");
             System.out.println("lugar");
        objHorario1.setFecha("01-06-2010");
        System.out.println("fecha");
        objHorario1.setCodAlumno(0);
        horarioProfesor.add(objHorario1);

         System.out.println("Agregando segundo horario");
        Horario objHorario2 = new Horario();
        objHorario2.setCodHorario(2);
        objHorario2.setCodProfesor(2);
        objHorario2.setCodHora(2);
        objHorario1.setLugar("Cibertec");
        objHorario2.setFecha("01-06-2010");
        objHorario2.setCodAlumno(0);
        horarioProfesor.add(objHorario2);

    }

      public List<Horario> getHorarioProfesor(int codProfesor) {
          
        List<Horario> lista = new ArrayList<Horario>();

        for (Horario horas : horarioProfesor) {

             System.out.println("codigo profesor :" +codProfesor);
            if (horas.getCodProfesor() == codProfesor  ){
                lista.add(horas);
                System.out.println("Hora :" + horas.getCodHora());
            }

        }       
          return lista;
      }

}
