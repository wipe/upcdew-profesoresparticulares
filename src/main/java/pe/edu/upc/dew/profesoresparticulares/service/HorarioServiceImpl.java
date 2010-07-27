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

    ArrayList<Curso> cursos = new ArrayList<Curso>();
    ArrayList<Horario> horarios = new ArrayList<Horario>();
    ArrayList<Usuario> listaprofesor = new ArrayList<Usuario>();
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


        /* Creacion de horarios */
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
        horarioProfesor.add(objHorario2);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Horario> registrarHorario() {
        Horario horario = new Horario();
        return horarios;
    }

    public void registrarHorario(Horario horario) {
        System.out.println("entra a registrar Horario");
        horarios.add(horario);
    }

    public ArrayList<Horario> getHorarioProfesor(int codProfesor) {

        ArrayList<Horario> lista = new ArrayList<Horario>();

        for (Horario horas : horarios) {

            System.out.println("codigo profesor :" + codProfesor);
            if (horas.getCodProfesor() == codProfesor) {
                lista.add(horas);
                System.out.println("Hora :" + horas.getHora());
            }

        }
        return lista;
    }

    public ArrayList<Usuario> getProfesorAlumno(int codAlumno) {
        listaprofesor = new ArrayList<Usuario>();
        Usuario usuario = null;
        System.out.println("Profesores de alumno " + codAlumno);
        for (Horario horas : horarioProfesor) {
            if (horas.getCodAlumno() == codAlumno) {
                if (!existeProfesor(horas.getCodProfesor())) {
                    usuario = new Usuario();
                    usuario.setCodUsuario(horas.getCodProfesor());
                    listaprofesor.add(usuario);
                }
            }
        }
        return listaprofesor;
    }

    private boolean existeProfesor(int codProfesor) {
        for (Usuario profesor : listaprofesor) {
            if (profesor.getCodUsuario() == codProfesor) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Horario> getProfesorHorarioDisponibles(int codProfesor, String fecha) {
        ArrayList<Horario> listaHorarioDisponibles = new ArrayList<Horario>();
        for (Horario horas : horarioProfesor) {
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

    public void reservarHorario(Integer codHora, Integer codAlumno) {
        System.out.println("metodo Reservar");
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
        for (Horario horario : horarios) {
            System.out.println(horario.getFecha().substring(0, 4));
            System.out.println(horario.getFecha().substring(5, 7));
            if (horario.getCodProfesor() == prof) {
                if (dia.equals("00")) {
                    if (anho.equals(horario.getFecha().substring(0, 4))) {
                        if (mes.equals(horario.getFecha().substring(5, 7))) {
                             System.out.println("añade");
                            horDisp.add(horario);
                        }
                    }
                } else {
                    if (dia.equals(horario.getFecha().substring(8, 10))) {
                        if (anho.equals(horario.getFecha().substring(0, 4))) {
                            if (mes.equals(horario.getFecha().substring(5, 7))) {
                                horDisp.add(horario);
                            }
                        }
                    }
                }
            }
        }
        return horDisp;
    }
}
