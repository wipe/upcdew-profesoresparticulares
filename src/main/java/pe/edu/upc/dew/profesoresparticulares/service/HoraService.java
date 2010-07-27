 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.service;

import java.util.ArrayList;
import pe.edu.upc.dew.profesoresparticulares.model.Hora;

/**
 *
 * @author synopsis
 */
public interface HoraService {

    public ArrayList<Hora> getHoras();
    public Hora getHora(Integer codHora);

}
