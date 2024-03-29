package Produto;

import semana09.senac.model.Fabricante;
import semana09.senac.model.Produto;

public record DadosListarProduto(
        Integer id,
        String nome, String descricao, Double preco, Fabricante fabricante) {
    public DadosListarProduto(Produto produto){
        this(
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getFabricante()
        );
    }
}