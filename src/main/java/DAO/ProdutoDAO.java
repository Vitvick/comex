package DAO;
package br.com.alura.comex.farmacia;
public class ProdutoDAO {
}
import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {
    private EntityManager em;

    public ProdutoDao(EntityManager em){
        this.em = em;
    }
    public void cadrastar(Produto produto){
        this.em.persist(produto);
    }

    public List<Produto> listar(){
        String jpql = "SELECT p FROM Produto p";
        return em.createQuery(jpql,Produto.class).getResultList();

    }
}