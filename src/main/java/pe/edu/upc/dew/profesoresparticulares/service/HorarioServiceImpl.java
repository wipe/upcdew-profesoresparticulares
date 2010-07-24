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


public class HorarioServiceImpl implements HorarioService{
    
    List<Curso> cursos = new ArrayList<Curso>();
    List<Horario> horarios = new ArrayList<Horario>();

    public HorarioServiceImpl(){
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


        /* Creacion de horarios */
         System.out.println("Agregando primer horario");
        Horario objHorario1 = new Horario();
        objHorario1.setCodHorario(1);
        objHorario1.setCodProfesor(2);
        objHorario1.setHora("1");
        objHorario1.setLugar("UPC");
        objHorario1.setFecha("01-06-2010");
        objHorario1.setCodAlumno(0);
        objHorario1.setNombreAlumno("");
        horarioProfesor.add(objHorario1);

         System.out.println("Agregando segundo horario");
        Horario objHorario2 = new Horario();
        objHorario2.setCodHorario(2);
        objHorario2.setCodProfesor(2);
        objHorario2.setHora("2");
        objHorario2.setLugar("Cibertec");
        objHorario2.setFecha("01-06-2010");
        objHorario2.setCodAlumno(1);
        objHorario2.setNombreAlumno("Luis Kina");
        horarioProfesor.add(objHorario2);
    }

    public List<Curso> getCursos(){
        return cursos;
    }

    public List<Horario> registrarHorario() {
        Horario horario = new Horario();        
        return horarios;
    }

    public void registrarHorario(Horario horario){
        horarios.add(horario);
    }


    private List<Horario> horarioProfesor = new ArrayList<Horario>();

    public List<Horario> getHorarioProfesor(int codProfesor) {

        List<Horario> lista = new ArrayList<Horario>();

        for (Horario horas : horarioProfesor) {

             System.out.println("codigo profesor :" +codProfesor);
            if (horas.getCodProfesor() == codProfesor  ){
                lista.add(horas);
                System.out.println("Hora :" + horas.getHora());
            }

        }
          return lista;
      }

    public List<Usuario> getUsuarioProfesores() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

     public List<Horario> getProfesorHorarioDisponibles(int codProfesor, String fecha) {

         List<Horario> listaHorario = getHorarioProfesor(codProfesor);

         List<Horario> listaHorarioDisponibles =  new ArrayList<Horario>();

          for (Horario horas : listaHorario) {
                if (horas.getCodAlumno() == null  ){
                    listaHorarioDisponibles.add(horas);
                }
          }

          System.out.println("horarios disponibles" + listaHorarioDisponibles.size());

          return listaHorarioDisponibles;
        
     }




}
