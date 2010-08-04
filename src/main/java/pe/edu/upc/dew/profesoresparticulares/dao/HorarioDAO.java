/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.dew.profesoresparticulares.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.util.JdbcUtils;

/**
 *
 * @author synopsis
 */
public class HorarioDAO {

    public Horario registrarHorario(Horario horario) {
        //Horario horario = new Horario();
        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "insert into horario values " +
                    "("+horario.getCodHorario()+","+horario.getCodProfesor()+
                    ","+horario.getCodAlumno()+",'"+horario.getFecha()+"',"+horario.getHora()+",'"+horario.getLugar()+"')";
            st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error sql exception");
            throw new IllegalStateException("Error al obtener el curso", e);

        } finally {
            System.out.println("Error sql exception 2");
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }
        return horario;
    }
}
