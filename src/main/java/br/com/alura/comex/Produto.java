package br.com.alura.comex;
//Tarefa 2
public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int numero;

    //Tarefa 7

    public Produto (String nome){
        this.nome = nome;
    }
    public void nome(String nome) {
    }

    // Tarefa 6

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getNumero() {
        return numero;
    }

    //Tarefa 4
    void imprimeDadosProduto(){
        System.out.println(">> Dados do Produto");
        System.out.println("Nome: " + nome );
        System.out.println("Nome: " + descricao );

    }



    }







