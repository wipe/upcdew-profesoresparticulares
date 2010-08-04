/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.profesoresparticulares.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pe.edu.upc.dew.profesoresparticulares.dao.UsuarioDao;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.util.JdbcUtils;

/**
 *
 * @author DUOTRABAJO
 */
public class UsuarioServiceImpl implements UsuarioService {

    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public UsuarioServiceImpl() {
    }

    public Usuario getUsuario(String mail, String password) {
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.getUsuario(mail, password);

    }

    public ArrayList<Usuario> getUsuarioProfesores() {
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.getUsuarioProfesores();
    }

    public ArrayList<Usuario> getUsuarioAlumnos() {
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.getUsuarioAlumnos();
    }

    public Usuario getUsuario(int codUsuario) {
        UsuarioDao usuarioDao = new UsuarioDao();
        return usuarioDao.getUsuario(codUsuario);
    }
}
