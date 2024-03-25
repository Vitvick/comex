package Modelo;
import com.alura.farmacia.repository.FabricanteRepository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Fabricantes")
public class Fabricante {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    public Fabricante (DadosFabricante dadosFabricante){
        this.nome = dadosFabricante.nome();
    }
}