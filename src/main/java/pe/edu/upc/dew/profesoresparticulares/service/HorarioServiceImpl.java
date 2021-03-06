/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.dao.HorarioDao;
import pe.edu.upc.dew.profesoresparticulares.model.Curso;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

public class HorarioServiceImpl implements HorarioService {

    ArrayList<Curso> cursos = new ArrayList<Curso>();
    ArrayList<Horario> horarios = new ArrayList<Horario>();    
    ArrayList<Horario> horarioProfesor = new ArrayList<Horario>();
    ArrayList<Horario> listaHorario = new ArrayList<Horario>();


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


        /* Creacion de horarios 
        System.out.println("Agregando primer horario");
        Horario objHorario1 = new Horario();
        objHorario1.setCodHorario(1L);
        objHorario1.setCodProfesor(2);
        objHorario1.setHora(1);
        objHorario1.setLugar("UPC");
        objHorario1.setFecha("2010-06-01");
        objHorario1.setCodAlumno(0);
        objHorario1.setNomAlumno("");
        horarioProfesor.add(objHorario1);

        System.out.println("Agregando segundo horario");
        Horario objHorario2 = new Horario();
        objHorario2.setCodHorario(2L);
        objHorario2.setCodProfesor(2);
        objHorario2.setHora(2);
        objHorario2.setLugar("Cibertec");
        objHorario2.setFecha("2010-06-01");
        objHorario2.setCodAlumno(1);
        objHorario2.setNomAlumno("Luis Kina");
        horarioProfesor.add(objHorario2);*/
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void cancelarReserva(Long codReserva){
        /*
           for (int i = 0; i < horarios.size(); i++){
                if (horarios.get(i).getCodHorario().equals(codReserva) ){
                    horarios.get(i).setCodAlumno(null);
                    horarios.get(i).setNomAlumno(null);
                }
           }
          */
         HorarioDao objHorarioDao = new HorarioDao();
         objHorarioDao.cancelarReserva(codReserva);
    }

    public ArrayList<Horario> getregistroHorario() {
        HorarioDao objHorarioDao = new HorarioDao();
        return  objHorarioDao.getregistroHorario();
    }

    public void registrarHorario(Horario horario) {
        System.out.println("entra a registrar Horario");
        horarios.add(horario);
    }

    public ArrayList<Horario> getHorarioProfesor(int codProfesor) {
         HorarioDao objHorarioDao = new HorarioDao();

       ArrayList<Horario> lista = new ArrayList<Horario>();
       
        ArrayList<Horario> objListaHorario = objHorarioDao.getregistroHorario();

        for (Horario horas : objListaHorario) {

            System.out.println("codigo profesor :" + codProfesor);
            if (horas.getCodProfesor() == codProfesor) {
                lista.add(horas);
                System.out.println("Hora :" + horas.getHora());
            }

        }
        return lista;
    }

    public ArrayList<Horario> getProfesorAlumno(int codAlumno) {
         HorarioDao objHorarioDao = new HorarioDao();
        ArrayList<Horario> objListaHorario = objHorarioDao.getregistroHorario();

        ArrayList<Horario> listaprofesor = new ArrayList<Horario>();
        for (Horario horario : objListaHorario) {
            if (horario.getCodAlumno()!=null && horario.getCodAlumno() == codAlumno) {
                if (!existeProfesor(horario.getCodProfesor(), listaprofesor)) {
                    listaprofesor.add(horario);
                }
            }
        }
        return listaprofesor;
    }

    private boolean existeProfesor(int codProfesor, ArrayList<Horario> listaprofesor) {
        for (Horario horario : listaprofesor) {
            if (horario.getCodProfesor() == codProfesor) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Horario> getProfesorHorarioDisponibles(int codProfesor, String fecha) {
        ArrayList<Horario> listaHorarioDisponibles = new ArrayList<Horario>();

       HorarioDao objHorarioDao = new HorarioDao();
        ArrayList<Horario> objListaHorario = objHorarioDao.getregistroHorario();

        for (Horario horas : objListaHorario) {
            System.out.println(horas.getFecha() + " fecha de la clase");
            System.out.println(fecha + " fecha String");

            if (horas.getCodAlumno() == null || horas.getCodAlumno() == 0) {

                if (horas.getFecha().equals(fecha)) {
                    listaHorarioDisponibles.add(horas);
                }
            }
        }


        return listaHorarioDisponibles;

    }

    public List<Horario> reservarHorario(Long codHora, Integer codAlumno, String nombreAlumno) {
        System.out.println("metodo Reservar");
     /*
          for (int i = 0; i < horarios.size(); i++){
                 if(horarios.get(i).getCodHorario().compareTo(codHora)==0 ){
                    horarios.get(i).setCodAlumno(codAlumno);
                    horarios.get(i).setNomAlumno(nombreAlumno);
                    System.out.println("horario reservado codAlumno: " + codAlumno + " CodHora : "  + codHora );
              }
          }
         */
          reservarHorario( codHora,  codAlumno,  nombreAlumno);
          HorarioDao objHorarioDao = new HorarioDao();
        ArrayList<Horario> objListaHorario = objHorarioDao.getregistroHorario();

          return objListaHorario;
    }

    public Horario getHorario(Horario hor) {
        for (Horario h : horarios) {
            if (h.getFecha().equals(hor.getFecha())
                    && h.getCodProfesor() == hor.getCodProfesor()
                    && h.getHora() == hor.getHora()) {
                return h;
            }
        }
        return null;
    }

    public List<Horario> getProfesorHorarioDisponibles(String dia, String mes, String anho) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Horario> getProfesorHorarioDisponibles(String profesor, String dia, String mes, String anho) {
        System.out.println(profesor);
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(anho);
        int prof = Integer.parseInt(profesor);

        ArrayList<Horario> horDisp = new ArrayList<Horario>();

         HorarioDao objHorarioDao = new HorarioDao();
        ArrayList<Horario> objListaHorario = objHorarioDao.getregistroHorario();

        for (Horario horario : objListaHorario) {
            System.out.println(horario.getFecha().substring(0, 4));
            System.out.println(horario.getFecha().substring(5, 7));
            if (horario.getCodProfesor() == prof) {
                if (dia.equals("00")) {
                    if (anho.equals(horario.getFecha().substring(0, 4))) {
                        if (mes.equals(horario.getFecha().substring(5, 7))) {
                             System.out.println("a�ade");
                              if(horario.getCodAlumno()==null || horario.getCodAlumno()== 0){
                                   horDisp.add(horario);
                              }
                                                   }
                    }
                } else {
                    if (dia.equals(horario.getFecha().substring(8, 10))) {
                        if (anho.equals(horario.getFecha().substring(0, 4))) {
                            if (mes.equals(horario.getFecha().substring(5, 7))) {
                                if(horario.getCodAlumno()==null || horario.getCodAlumno().equals("")){
                                    horDisp.add(horario);
                                }
                                
                            }
                        }
                    }
                }
            }
        }
        return horDisp;
    }
}
