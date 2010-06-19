/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author synopsis
 */
public abstract class BaseAction extends ActionSupport {

    public HttpServletRequest getRequest() {
        return ServletActionContext.getRequest();
    }

    public void setRequest(String name, Object value){
        getRequest().setAttribute(name, value);
    }

    public HttpSession getSession() {
            return ServletActionContext.getRequest().getSession();
    }

    public void setSession(String name, Object value){
        getSession().setAttribute(name, value);
    }

    public HttpServletResponse getResponse() {
        return ServletActionContext.getResponse();
    }

}
