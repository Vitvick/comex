package Fabricacao;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface para fornecer os métodos CRUD para operações de fabricantes no banco de dados
public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
    Fabricante findByNome(String nome);
}