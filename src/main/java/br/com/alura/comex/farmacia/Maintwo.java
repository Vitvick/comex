package br.com.alura.comex.farmacia;
package DAO;
public class Maintwo {
}
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Semana-7-Farmacia");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        ProdutoDao produtoDao = new ProdutoDao(em);
        List<Produto> lista = List(produtoDao.listar());
        System.out.println(lista);

        em.getTransaction().commit();
        em.close();
    }
}