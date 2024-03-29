package model;

public class FabricanteSemana9 {

    import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import semana09.senac.produto.DadosCadastroFabricante;
import semana09.senac.produto.DadosCadastroProduto;

    @Table(name = "fabricante")
    @Entity
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = "id")
    public class Fabricante {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String nome;

        public Fabricante(DadosCadastroFabricante dados){
            this.nome = nome;
            this.id = id;
        }

        public Fabricante(Integer id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Fabricante{" +
                    "nome='" + nome + '\'' +
                    '}';
        }
    }
}
