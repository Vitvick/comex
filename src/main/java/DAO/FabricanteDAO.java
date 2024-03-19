package DAO;
package br.com.alura.comex.farmacia;
public class FabricanteDAO {
}
import javax.persistence.EntityManager;

public class FabricanteDao {
    private EntityManager em;
    public FabricanteDao (EntityManager em){
        this.em = em;
    }

    public void cadrastrar (Fabricante fabricante){
        this.em.persist(fabricante);

    }
}