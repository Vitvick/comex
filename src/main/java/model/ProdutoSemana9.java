package model;

public class ProdutoSemana9 {

    import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import semana09.senac.produto.DadosAtualizaProduto;
import semana09.senac.produto.DadosCadastroProduto;

    @Table(name = "produto")
    @Entity
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = "id")
    public class Produto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String nome;
        private String descricao;
        private double preco;
        @ManyToOne
        private Fabricante fabricante;

        public Produto(DadosCadastroProduto dados, Fabricante fabricante) {
            this.nome = dados.nome();
            this.descricao = dados.descricao();
            this.preco = dados.preco();
            this.fabricante = fabricante;
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "nome='" + nome + '\'' +
                    ", descricao='" + descricao + '\'' +
                    ", preco=" + preco +
                    '}';
        }

        public void atualizarInformacao(DadosAtualizaProduto dados) {
            this.descricao = dados.descricao();
        }
    }
}
