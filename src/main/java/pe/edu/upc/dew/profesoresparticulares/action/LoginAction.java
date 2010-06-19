/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.service.LoginService;
import pe.edu.upc.dew.profesoresparticulares.util.Constantes;

/**
 *
 * @author synopsis
 */
public class LoginAction extends BaseAction{

    private String usuario;
    private String password;

    private LoginService service;

    public LoginAction(LoginService loginService) {
        this.service = loginService;
    }

    public String login(){
        System.out.println("inicio");
        Usuario user = service.getUsuario(usuario, password);
        
        if(user!=null){
            setSession(Constantes.USUARIO, user);
            System.out.println(user.getPassword());
            setSession(Constantes.MENU, service.getMenu(user.getTipoUsuario()));
        }
        return SUCCESS;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
