/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.List;
import java.util.Map;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author Wilder
 */
public interface LoginService {

    public Usuario getUsuario(String mail, String password);
    public List<Map> getMenu(String tipoUsuario);

}
