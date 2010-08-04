/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author HDRESDA
 */
public class testjdbc {

   public static void main(String [] arg){
       Connection connection = JdbcUtils.getConnection();

         connection = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            connection = JdbcUtils.getConnection();
            st = connection.createStatement();
            final String query = "select * from usuario";// where mail = '" + "" + "'";
            
            rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("nomUsuario"));
                System.out.println(rs.getString("mail"));
                Usuario u = new Usuario();
                u.setMail(rs.getString("mail"));
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Error al obtener el cliente", e);
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closeStatement(st);
            JdbcUtils.closeConnection(connection);
        }



   }

}
