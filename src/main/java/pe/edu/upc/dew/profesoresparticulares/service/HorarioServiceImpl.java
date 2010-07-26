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

public class HorarioServiceImpl implements HorarioService {

    List<Curso> cursos = new ArrayList<Curso>();
    List<Horario> horarios = new ArrayList<Horario>();
    List<Usuario> listaprofesor = new ArrayList<Usuario>();
    List<Horario> horarioProfesor = new ArrayList<Horario>();
    List<Horario> listaHorario = new ArrayList<Horario>();


    public HorarioServiceImpl() {
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
        objHorario1.setFecha("2010-06-01");
        objHorario1.setCodAlumno(0);
        objHorario1.setNombreAlumno("");
        horarioProfesor.add(objHorario1);

        System.out.println("Agregando segundo horario");
        Horario objHorario2 = new Horario();
        objHorario2.setCodHorario(2);
        objHorario2.setCodProfesor(2);
        objHorario2.setHora("2");
        objHorario2.setLugar("Cibertec");
        objHorario2.setFecha("2010-06-01");
        objHorario2.setCodAlumno(1);
        objHorario2.setNombreAlumno("Luis Kina");
        horarioProfesor.add(objHorario2);
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Horario> registrarHorario() {
        Horario horario = new Horario();
        return horarios;
    }

    public void registrarHorario(Horario horario) {
        horarios.add(horario);
    }
    

    public List<Horario> getHorarioProfesor(int codProfesor) {

        List<Horario> lista = new ArrayList<Horario>();

        for (Horario horas : horarioProfesor) {

            System.out.println("codigo profesor :" + codProfesor);
            if (horas.getCodProfesor() == codProfesor) {
                lista.add(horas);
                System.out.println("Hora :" + horas.getHora());
            }

        }
        return lista;
    }

    public List<Usuario> getProfesorAlumno(int codAlumno) {
        listaprofesor = new ArrayList<Usuario>();
        Usuario usuario = null;
        System.out.println("Profesores de alumno " +  codAlumno );
        for (Horario horas : horarioProfesor) {
            if (horas.getCodAlumno() == codAlumno) {
                if (!existeProfesor(horas.getCodProfesor()))  {
                    usuario = new Usuario();
                    usuario.setCodUsuario(horas.getCodProfesor());
                    listaprofesor.add(usuario);
                }
            }
        }
        return listaprofesor;
    }

    private boolean existeProfesor(int codProfesor){
        for (Usuario profesor : listaprofesor){
            if (profesor.getCodUsuario() == codProfesor) {
                return true;
            }
        }
        return false;
    }



     public List<Horario> getProfesorHorarioDisponibles(int codProfesor, String fecha) {
         List<Horario> listaHorarioDisponibles =  new ArrayList<Horario>();
          for (Horario horas : listaHorario) {
              System.out.println(horas.getFecha() + " fecha de la clase");
              System.out.println(fecha + " fecha String");

                if (horas.getCodAlumno() == null || horas.getCodAlumno() == 0 ){

                    if (horas.getFecha().equals(fecha)){
                         listaHorarioDisponibles.add(horas);
                    }
                   
                }
          }

         
          return listaHorarioDisponibles;
        
     }

     public void reservarHorario(Integer codHora, Integer codAlumno){
          System.out.println("metodo Reservar");
     }




}
