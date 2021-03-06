/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;
import pe.edu.upc.dew.profesoresparticulares.util.Constantes;

/**
 *
 * @author Wilder
 */
public class AuthorizationInterceptor extends AbstractInterceptor  {

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        Map session = invocation.getInvocationContext().getSession();
        if(session.get(Constantes.USUARIO)==null){
            return Action.ERROR;
        }else{
            return invocation.invoke();
        }
    }

}
