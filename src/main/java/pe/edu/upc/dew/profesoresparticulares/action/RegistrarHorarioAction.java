/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import pe.edu.upc.dew.profesoresparticulares.service.RegistrarHorarioService;

/**
 *
 * @author synopsis
 */
public class RegistrarHorarioAction extends BaseAction{

    private RegistrarHorarioService service;

    public RegistrarHorarioAction(RegistrarHorarioService registrarHorarioService) {
        this.service = registrarHorarioService;
    }

    public String registrarHorario(){
        System.out.println("ntra a grabar");
        return SUCCESS;
    }

    public String borrarHorario(){
        System.out.println("ntra a borrar");
        return SUCCESS;
    }

}
