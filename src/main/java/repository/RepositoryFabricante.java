package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import semana09.senac.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}