/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.profesoresparticulares.action;

import pe.edu.upc.dew.profesoresparticulares.service.AlumnoClasificacionProfesorService;

/**
 *
 * @author HDRESDA
 */
public class AlumnoClasificacionProfesorAction extends BaseAction {

    private AlumnoClasificacionProfesorService service;

     public AlumnoClasificacionProfesorAction(AlumnoClasificacionProfesorService alumnoClasificacionProfesorService) {
        this.service = alumnoClasificacionProfesorService;
    }

    public String registrarCalificacion(){
        System.out.println("Registrar Calificacion");
        return SUCCESS;
    }



}
