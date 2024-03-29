package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import semana09.senac.model.Fabricante;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
}