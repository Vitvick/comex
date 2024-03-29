package Produto;

import semana09.senac.model.Fabricante;
import semana09.senac.model.Produto;

public record DadosCadastroProduto (String nome, String descricao, double preco, Fabricante fabricante) {}