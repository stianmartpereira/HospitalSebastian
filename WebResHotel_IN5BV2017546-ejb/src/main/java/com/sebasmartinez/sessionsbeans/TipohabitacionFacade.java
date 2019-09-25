/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebasmartinez.sessionsbeans;

import com.sebasmartinez.entities.Tipohabitacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class TipohabitacionFacade extends AbstractFacade<Tipohabitacion> implements TipohabitacionFacadeLocal {

    @PersistenceContext(unitName = "WebResHotel_IN5BM_2015396PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipohabitacionFacade() {
        super(Tipohabitacion.class);
    }
    
}
