/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
/**
 *
 * @author DUOTRABAJO
 */
public class UsuarioServiceImpl implements UsuarioService {

    private List<Usuario> usuarios = new ArrayList<Usuario>();


    public UsuarioServiceImpl(){
         Usuario user = new Usuario();
        user.setCodUsuario(1);
        user.setMail("alumno@upc.com");
        user.setApePaterno("Rojas");
        user.setApeMaterno("Sanchez");
        user.setNomUsuario("Julio");
        user.setPassword("123");
        user.setTipoUsuario("alumno");
        usuarios.add(user);

        user = new  Usuario();
        user.setCodUsuario(2);
        user.setMail("profesor@upc.com");
        user.setApePaterno("Sosa");
        user.setApeMaterno("Hernandez");
        user.setNomUsuario("Roberto");
        user.setPassword("123");
        user.setTipoUsuario("profesor");
        usuarios.add(user);

        System.out.println(usuarios.size() +"oooooooooooooooooooooooooooooooooooooo");
    }

   public Usuario getUsuario(String mail, String password) {
    
        for (Usuario usuario : usuarios) {
            if(usuario.getMail().equals(mail)){
                if(password.equals(usuario.getPassword())){
                    return usuario;
                }
            }
        }
        return null;
    }

     public List<Usuario> getUsuarioProfesores() {

         List<Usuario> UsuarioProfesor = new ArrayList() ;
        for (Usuario usuario : usuarios) {

            if (usuario.getTipoUsuario().equals("profesor")){
                UsuarioProfesor.add(usuario);
            }
        }
        System.out.println(UsuarioProfesor.size() +" cantidad de profesores");

        return  UsuarioProfesor;

    }

     public List<Usuario> getUsuarioAlumnos() {

         List<Usuario> UsuarioAlumnos = null;
        for (Usuario usuario : usuarios) {

            if (usuario.getTipoUsuario().equals("alumno")){
                UsuarioAlumnos.add(usuario);
            }
        }

        return  UsuarioAlumnos;

    }



}
