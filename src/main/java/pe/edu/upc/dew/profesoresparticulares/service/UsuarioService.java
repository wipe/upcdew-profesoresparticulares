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
public interface UsuarioService {

    public ArrayList<Usuario> getUsuarioProfesores();

    public ArrayList<Usuario> getUsuarioAlumnos();

    public Usuario getUsuario(String mail, String password);

    public Usuario getUsuario(int codUsuario);
}
