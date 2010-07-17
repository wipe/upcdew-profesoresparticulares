/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;
import java.util.List;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author DUOTRABAJO
 */
public interface UsuarioService {

     public  List<Usuario> getUsuarioProfesores();

     public  List<Usuario> getUsuarioAlumnos();

     public Usuario getUsuario(String mail, String password);




}
