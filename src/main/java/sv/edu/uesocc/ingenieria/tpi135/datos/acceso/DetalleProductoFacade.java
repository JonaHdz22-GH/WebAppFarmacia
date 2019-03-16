/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.tpi135.datos.acceso;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.ingenieria.tpi135.datos.definicion.DetalleProducto;

/**
 *
 * @author jonahdz
 */
@LocalBean
@Stateless
public class DetalleProductoFacade extends AbstractFacade<DetalleProducto> implements DetalleProductoFacadeLocal {

    @PersistenceContext(unitName = "FarmaciaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleProductoFacade() {
        super(DetalleProducto.class);
    }
    
}