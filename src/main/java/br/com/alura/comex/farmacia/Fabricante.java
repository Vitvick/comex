package br.com.alura.comex.farmacia;

public class Fabricante {
}
import javax.persistence.*;

@Entity
@Table(name = "fabricantes")
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String nome;

    public Fabricante() {}

    public Fabricante(String nome) {
        this.nome = nome;
    }


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

    @Override
    public String toString() {
        return "Fabricante{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}