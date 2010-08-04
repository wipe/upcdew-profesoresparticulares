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


import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.util.JdbcUtils;


/**
 *
 * @author DUOTRABAJO
 */
public class HorarioDao {

     public void reservarHorario(Long codHora, Integer codAlumno, String nombreAlumno){
        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;

          try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "update horario set codAlumno = '" +codAlumno +"' codHorario =  '" +codHora + "'" ;
           st.executeUpdate(query);

        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el usuario", e);
        } finally {
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }

     }

     public void cancelarReserva(Long codReserva){
        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
       

       try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "update horario set codAlumno = 0 where codHorario = '" +codReserva +"'" ;
           st.executeUpdate(query);

        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el usuario", e);
        } finally {
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }

      }
     

      public ArrayList<Horario> getregistroHorario() {

        ArrayList<Horario> HorariosRegistrados = new ArrayList();


        Connection connection = JdbcUtils.getConnection();

        connection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "select A.codHorario, A.codProfesor,  concat(B.nomUsuario,' ' ,B.apepaterno ) as 'nomProfesor',A.codAlumno, concat(C.nomUsuario,' ' ,C.apepaterno ) as 'nomAlumno', A.fecha, A.codHora, A.lugar from 	horario A left outer join usuario B on A.codprofesor = B.codUsuario left outer join usuario C on A.codAlumno = C.codUsuario";
            rs = st.executeQuery(query);
             while (rs.next())  {
                Horario objHorario= new Horario();
                objHorario.setCodHorario(rs.getLong("codHorario"));
                objHorario.setCodProfesor(rs.getInt("codProfesor"));
                objHorario.setNomProfesor(rs.getString("nomProfesor"));
                objHorario.setCodAlumno(rs.getInt("codAlumno"));
                objHorario.setNomAlumno(rs.getString("nomAlumno"));
                objHorario.setFecha(rs.getString("fecha"));
                objHorario.setHora(rs.getInt("codHora"));
                objHorario.setLugar(rs.getString("lugar"));

                HorariosRegistrados.add(objHorario);

            }
              System.out.println("Horarios Dao " + HorariosRegistrados.size() );
            return HorariosRegistrados;
        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el usuario", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }

      }






}

