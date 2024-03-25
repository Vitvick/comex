package Modelo;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    @ManyToOne
    private Fabricante fabricante;

    public Produto (DadosProduto dadosProduto){
        this.nome = dadosProduto.nome();
        this.descricao = dadosProduto.descricao();
        this.preco = dadosProduto.preco();
        this.fabricante = getFabricante();
    }

    // Getters e setters ------------------------------------------------------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Produto - " +
                "Id= " + id +
                "\n Nome= '" + nome + '\'' +
                "\n Descricao= '" + descricao + '\'' +
                "\n Preco= " + preco +
                "\n Fabricante= " + fabricante +
                '}';
    }
}