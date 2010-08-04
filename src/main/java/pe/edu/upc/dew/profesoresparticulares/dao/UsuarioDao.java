/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.profesoresparticulares.dao;

/**
 *
 * @author HDRESDA
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.util.JdbcUtils;

public class UsuarioDao {

    public Usuario getUsuario(String mail, String password) {
        Usuario usuario = new Usuario();
        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "select * from usuario where mail = '" + mail + "' And password='" + password + "'";
            rs = st.executeQuery(query);
            if (rs.next()) {
                usuario.setCodUsuario(rs.getInt("codUsuario"));
                usuario.setNomUsuario(rs.getString("nomUsuario"));
                usuario.setApePaterno(rs.getString("ApePaterno"));
                usuario.setApeMaterno(rs.getString("ApeMaterno"));
                usuario.setMail(rs.getString("mail"));

                if (rs.getString("tipoUsuario").equals("A")) {
                    usuario.setTipoUsuario("alumno");
                } else {
                    usuario.setTipoUsuario("profesor");
                }

                usuario.setFecNacimiento(rs.getString("fecnacimiento"));
                usuario.setCodCurso(rs.getInt("codCurso"));

                return usuario;
            }
            return null;
        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el usuario", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }

    }

    public ArrayList<Usuario> getUsuarioProfesores() {
        ArrayList<Usuario> usuarioProfesor = new ArrayList();
        Usuario usuario = new Usuario();
        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "select * from usuario where tipousuario='P'";
            rs = st.executeQuery(query);
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setCodUsuario(rs.getInt("codUsuario"));
                usuario.setNomUsuario(rs.getString("nomUsuario"));
                usuario.setApePaterno(rs.getString("ApePaterno"));
                usuario.setApeMaterno(rs.getString("ApeMaterno"));
                usuario.setMail(rs.getString("mail"));

                if (rs.getString("tipoUsuario").equals("A")) {
                    usuario.setTipoUsuario("alumno");
                } else {
                    usuario.setTipoUsuario("profesor");
                }

                usuario.setFecNacimiento(rs.getString("fecnacimiento"));
                usuario.setCodCurso(rs.getInt("codCurso"));

                usuarioProfesor.add(usuario);

            }
            return usuarioProfesor;
        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el usuario", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }

    }

    public ArrayList<Usuario> getUsuarioAlumnos() {
     ArrayList<Usuario> usuarioProfesor = new ArrayList();
        Usuario usuario = new Usuario();
        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "select * from usuario where tipousuario='A'";
            rs = st.executeQuery(query);
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setCodUsuario(rs.getInt("codUsuario"));
                usuario.setNomUsuario(rs.getString("nomUsuario"));
                usuario.setApePaterno(rs.getString("ApePaterno"));
                usuario.setApeMaterno(rs.getString("ApeMaterno"));
                usuario.setMail(rs.getString("mail"));

                if (rs.getString("tipoUsuario").equals("A")) {
                    usuario.setTipoUsuario("alumno");
                } else {
                    usuario.setTipoUsuario("profesor");
                }

                usuario.setFecNacimiento(rs.getString("fecnacimiento"));
                usuario.setCodCurso(rs.getInt("codCurso"));

                usuarioProfesor.add(usuario);

            }
            return usuarioProfesor;
        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el usuario", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }


    }

    public Usuario getUsuario(int codUsuario) {
        Usuario usuario = new Usuario();
        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "select * from usuario where codUsuario = '" + codUsuario + "'";
            rs = st.executeQuery(query);
            if (rs.next()) {
                usuario.setCodUsuario(rs.getInt("codUsuario"));
                usuario.setNomUsuario(rs.getString("nomUsuario"));
                usuario.setApePaterno(rs.getString("ApePaterno"));
                usuario.setApeMaterno(rs.getString("ApeMaterno"));
                usuario.setMail(rs.getString("mail"));

                if (rs.getString("tipoUsuario").equals("A")) {
                    usuario.setTipoUsuario("alumno");
                } else {
                    usuario.setTipoUsuario("profesor");
                }

                usuario.setFecNacimiento(rs.getString("fecnacimiento"));
                usuario.setCodCurso(rs.getInt("codCurso"));

                return usuario;
            }
            return null;
        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el usuario", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }

    }
}
