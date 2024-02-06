package br.com.alura.comex;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Para tarefa 3
public class Teste {
    public static void main(String[] args) {
        Produto produtoRoupa = new Produto("Camiseta");

        produtoRoupa.nome("Camiseta");
        produtoRoupa.setDescricao("Camiseta de malha, Tamanho G, Cor Preta,");
        produtoRoupa.setPrecoUnitario(86.30);
        produtoRoupa.setNumero(20);

        System.out.println("Comprei uma " + produtoRoupa.getNome() + " que custa R$ " + produtoRoupa.getPrecoUnitario());

        Produto produtoElectri = new Produto("Televisão");

        produtoElectri.nome("Televisão");
        produtoElectri.setDescricao("LG, de 60 polegadas, 4k");
        produtoElectri.setPrecoUnitario(6540.90);
        produtoElectri.setNumero(2);

        System.out.println("Agora eu comprei 2 produtos: " + produtoRoupa.getNome() + " e " + produtoElectri.getNome());

        System.out.println("Minha " + produtoElectri.getNome() + " é uma " + produtoElectri.getDescricao() +
                " como a " + produtoRoupa.getNome() + " é mais barata  do que o a Tv que custa R$ " + produtoElectri.getPrecoUnitario() +
                " eu comprei apenas " + produtoElectri.getNumero() + " peças");


        // Tarefa 4 - Criar produto Livro

        Produto produtoLivro = new Produto("Livro");

        produtoLivro.nome("Livro");
        produtoLivro.setDescricao("Conjunto de folhas impressas");

        produtoLivro.imprimeDadosProduto();



        // Tarefa 5 Criação de objetos Clientes e Endereço

        Endereco enderecoMeu = new  Endereco ();

        enderecoMeu.bairro = "Santana";
        enderecoMeu.cidade = "São Paulo";
        enderecoMeu.estado = "São Paulo";
        enderecoMeu.rua = "Francisca Julia";
        enderecoMeu.numero = 283;
        enderecoMeu.complemento = "Apartamento 27";


        Cliente cliente1 = new  Cliente ();

        cliente1.nome = "Victória dos Santos Oliveira";
        cliente1.cpf = "587.658.587.66";
        cliente1.email = "vickll.ll@gmail.com";
        cliente1.profissao = "Educadora";
        cliente1.telefone = " 11 9 961857552";
        cliente1.estado = "Paraná";



        System.out.println("Me chamo " + cliente1.nome + " , moro em " + enderecoMeu.bairro
        + " na rua " + enderecoMeu.rua + " número " + enderecoMeu.numero + " eu trabalho como "
        +cliente1.profissao + " , e meu e-mail para contato é " +cliente1.email + " e eu nasci no " + cliente1.estado);

        // Tarefa 8

        ArrayList<Produto> listaDeProduto = new ArrayList<>();
        listaDeProduto.add(produtoRoupa);
        listaDeProduto.add(produtoElectri);
        listaDeProduto.add(produtoLivro);

        listaDeProduto.imprimeProdutos();




    }
}




