/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.profesoresparticulares.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pe.edu.upc.dew.profesoresparticulares.model.Curso;
import pe.edu.upc.dew.profesoresparticulares.util.JdbcUtils;

/**
 *
 * @author HDRESDA
 */
public class CursoDao {

    public ArrayList<Curso> getCursos() {

        ArrayList<Curso> cursos = new ArrayList();
        Curso curso = new Curso();

        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "select * from curso";
            rs = st.executeQuery(query);
            while (rs.next()) {
                curso = new Curso();
                curso.setCodCurso(rs.getInt("codCurso"));
                curso.setNomCurso(rs.getString("nomCurso"));
                cursos.add(curso);
            }
            return cursos;
        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener los cursos", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }


    }

    public Curso getCurso(Integer codCurso) {
        Curso curso = new Curso();
        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "select * from curso where codCurso = '" + codCurso + "'";
            rs = st.executeQuery(query);
            if (rs.next()) {
                curso.setCodCurso(rs.getInt("codCurso"));
                curso.setNomCurso(rs.getString("nomCurso"));
                return curso;
            }
            return null;
        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el curso", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }
    }
}
