/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

/**
 *
 * @author synopsis
 */
public class LoginAction extends BaseAction{

    private String usuario;
    private String password;

    public String login(){
        if(usuario.equals("demo")&&password.equals("demo")){
            return SUCCESS;
        }else{
            return ERROR;
        }
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
