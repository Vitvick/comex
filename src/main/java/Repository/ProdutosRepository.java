package Repository;


import com.alura.farmacia.modelo.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}

public class ProdutosRepository {
}
