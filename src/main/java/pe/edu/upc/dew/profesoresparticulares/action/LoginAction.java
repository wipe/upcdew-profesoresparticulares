/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import pe.edu.upc.dew.profesoresparticulares.model.Horario;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;
import pe.edu.upc.dew.profesoresparticulares.service.LoginService;
import pe.edu.upc.dew.profesoresparticulares.service.HorarioServiceImpl;
import pe.edu.upc.dew.profesoresparticulares.util.Constantes;


/**
 *
 * @author synopsis
 */
public class LoginAction extends BaseAction{

    Logger log = Logger.getLogger(this.getClass());

    private String usuario;
    private String password;

    private LoginService service;

    public LoginAction(LoginService loginService) {
        this.service = loginService;
    }

    public String login(){
        log.debug("inicio");
        Usuario user = service.validaUsuario(usuario, password);

        
        if(user!=null){
            setSession(Constantes.USUARIO, user);
            System.out.println(user.getPassword());
            setSession(Constantes.MENU, service.getMenu(user.getTipoUsuario()));
            System.out.println(service.getMenu(user.getTipoUsuario()).size()+"");

            System.out.println("Cargando horarios");

            HorarioServiceImpl controladorHorario = new HorarioServiceImpl();
            ArrayList<Horario> objHorarios = new  ArrayList<Horario>();
               System.out.println(user.getCodUsuario() + " codigo de profesor" );
            objHorarios = controladorHorario.getHorarioProfesor(user.getCodUsuario());


              System.out.println("Horarios cargados");

             System.out.println(objHorarios.size() + " objHorarios tamaño" );

             System.out.println("subiendo en la sesion");
             setSession("horariosProfesor", objHorarios);
              System.out.println("horarios subidos");

              return SUCCESS;

        }else{
            return ERROR;
        }
        
    }

    public String salir(){
        getSession().removeAttribute(Constantes.USUARIO);
        getSession().invalidate();
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
