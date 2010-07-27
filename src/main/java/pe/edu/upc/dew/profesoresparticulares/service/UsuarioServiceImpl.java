/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
/**
 *
 * @author DUOTRABAJO
 */
public class UsuarioServiceImpl implements UsuarioService {

    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();


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

     public ArrayList<Usuario> getUsuarioProfesores() {

         ArrayList<Usuario> UsuarioProfesor = new ArrayList() ;

        for (Usuario usuario : usuarios) {

            if (usuario.getTipoUsuario().equals("profesor")){
                UsuarioProfesor.add(usuario);
            }
        }
        
        return  UsuarioProfesor;

    }

     public ArrayList<Usuario> getUsuarioAlumnos() {

         ArrayList<Usuario> UsuarioAlumnos = new ArrayList() ;
        for (Usuario usuario : usuarios) {

            if (usuario.getTipoUsuario().equals("alumno")){
                UsuarioAlumnos.add(usuario);
            }
        }

        return  UsuarioAlumnos;

    }

    public Usuario getUsuario(int codUsuario){
        Usuario usuariodatos = new Usuario();

        for (Usuario usuario : usuarios) {
            if (usuario.getCodUsuario() == codUsuario ){
                usuariodatos = usuario;
                break;
            }
        }
        return usuariodatos;
    }

   



}
