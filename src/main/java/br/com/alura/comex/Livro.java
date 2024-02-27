package br.alura.com.semana5.api;

public class Livro extends br.alura.com.semana5.api.Produto {

    String isbn;
    String nome;
    int totalpaginas;

    public Livro(String nome, String isbn) {
        this.nome = nome;
        this.isbn = isbn;
    }

    @java.lang.Override
    public String toString() {
        return "Livro: " + nome + " - " +
                "isbn: " + isbn;

    }
}
