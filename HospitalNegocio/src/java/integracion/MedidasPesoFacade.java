/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import Entidades.MedidasPeso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DT8
 */
@Stateless
public class MedidasPesoFacade extends AbstractFacade<MedidasPeso> implements MedidasPesoFacadeLocal {

    @PersistenceContext(unitName = "HospitalNegocioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MedidasPesoFacade() {
        super(MedidasPeso.class);
    }
    
}
