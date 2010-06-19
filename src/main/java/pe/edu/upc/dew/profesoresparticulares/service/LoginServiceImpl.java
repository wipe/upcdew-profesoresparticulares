/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author Wilder
 */
public class LoginServiceImpl implements LoginService{

    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private List<Map> menus = new ArrayList<Map>();

    public LoginServiceImpl() {
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

        Map menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "xxx.action");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "xxx.action");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "xxx.action");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "alumno");
        menu.put("url", "xxx.action");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "PaginaProfesor.action");
        menu.put("descripcion", "Inicio Profesores");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "xxx.action");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "xxx.action");
        menus.add(menu);
        menu = new HashMap();
        menu.put("tipo", "profesor");
        menu.put("url", "xxx.action");
        menus.add(menu);
    }

    public Usuario getUsuario(String mail, String password) {
        Usuario user = null;
        for (Usuario usuario : usuarios) {            
            if(usuario.getMail().equals(mail)){
                System.out.println("mail q Llega"+mail);
                if(password.equals(usuario.getPassword())){
                    return user;
                }
            }
        }
        return user;
    }

    public List<Map> getMenu(String tipoUsuario) {
        List<Map> menu = new ArrayList<Map>();
        for (Map m : menus) {
            if(m.get("tipo").equals(tipoUsuario)){
                menu.add(m);
            }
        }
        return menu;
    }

}
