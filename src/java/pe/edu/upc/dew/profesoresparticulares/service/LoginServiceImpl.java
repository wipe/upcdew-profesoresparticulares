/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.dew.profesoresparticulares.model.Usuario;

/**
 *
 * @author synopsis
 */
@Transactional
public class LoginServiceImpl implements LoginService{

    private EntityManager em;    

    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    public Usuario getusuario(Integer id){
        Usuario user = new Usuario();
        // = em.find(Usuario.class, id);
        getAll();
        return user;
    }

    public void getAll(){
        Query query = getEntityManager().createQuery("select p FROM Usuario");        
        List<Usuario> result = query.getResultList();
        for (Usuario usuario : result) {
            System.out.println(usuario.getApeMaterno());
            System.out.println(usuario.getApePaterno());
        }

    }

    private EntityManager getEntityManager() {
        return em;
    }

}
