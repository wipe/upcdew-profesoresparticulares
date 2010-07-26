/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author Wilder
 */
public class LoginServiceImpl implements LoginService{

    private Usuario usuario ;
    private UsuarioServiceImpl objUsuario = new UsuarioServiceImpl() ;
    private List<Map> menus = new ArrayList<Map>();

    public LoginServiceImpl() {


      
        Map menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "PaginaAlumno.action");
        menu.put("descripcion", "Inicio Alumno");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "PaginaRealizarReservasAlumno.action");
        menu.put("descripcion", "Realizar Reservas");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "PaginaConsultaReservasAlumno.action");
        menu.put("descripcion", "Reservas Realizadas");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "PaginaPerfilAlumno.action");
        menu.put("descripcion", "Perfil");
        menus.add(menu);

        menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "PaginaAlumnoClasificarProfesor.action");
        menu.put("descripcion", "Calificacion de Profesores");
        menus.add(menu);

        menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "Salir.action");
        menu.put("descripcion", "Salir");
        menus.add(menu);

    
        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "PaginaProfesor.action");
        menu.put("descripcion", "Inicio Profesores");
        menus.add(menu);

        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "PaginaRegistroHorarioProfesor.action");
        menu.put("descripcion", "Registro de Horario");
        menus.add(menu);

        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "PaginaConsultaHorarioProfesor.action");
        menu.put("descripcion", "Consulta Horario");

        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "PaginaPerfilProfesor.action");
        menu.put("descripcion", "Perfil");
        menus.add(menu);

        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "Salir.action");
        menu.put("descripcion", "Salir");
        menus.add(menu);

    }

    public Usuario validaUsuario(String mail, String password) {
        System.out.println("Valida usuario__________________________");
        Usuario user = objUsuario.getUsuario(mail, password);
        System.out.println("Obtiene usuario__________________________");
        
        if (user != null){
             return user;
        }
        else{
             return null;
        }
           
    }

   

    public List<Map> getMenu(String tipoUsuario) {
        List<Map> menu = new ArrayList<Map>();
        for (Map m : menus) {
            if(m.get("tipo").equals(tipoUsuario)){
                menu.add(m);
            }
        }
        return menu;
    }

}
