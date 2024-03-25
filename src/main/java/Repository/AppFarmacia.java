package Repository;

import com.alura.farmacia.repository.FabricanteRepository;
import com.alura.farmacia.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmaciaApplication implements CommandLineRunner {

    @Autowired
    private FabricanteRepository fabricanteRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FarmaciaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(fabricanteRepository);
        principal.exibeMenu();
    }
}
public class AppFarmacia {
}
