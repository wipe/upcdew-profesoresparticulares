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
public class HoraServiceImpl implements HoraService{
  
    private ArrayList<Hora> horas = new ArrayList<Hora>();

    public HoraServiceImpl() {
        System.out.println("inicializa horaserviceimpl");
        horas.add(new Hora(8,"08:00"));
        horas.add(new Hora(9,"09:00"));
        horas.add(new Hora(10,"10:00"));
        horas.add(new Hora(11,"11:00"));
        horas.add(new Hora(12,"12:00"));
        horas.add(new Hora(13,"13:00"));
        horas.add(new Hora(14,"14:00"));
    }

    public ArrayList<Hora> getHoras() {
        return horas;
    }

    public Hora getHora(Integer codHora) {
        for (Hora hora : horas) {
            if(hora.getClave()==codHora){
                return hora;
            }
        }
        return new Hora();
    }

}
