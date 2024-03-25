package Principal;

import com.alura.farmacia.modelo.DadosFabricante;
import com.alura.farmacia.modelo.DadosProduto;
import com.alura.farmacia.modelo.Fabricante;
import com.alura.farmacia.modelo.Produto;
import com.alura.farmacia.repository.FabricanteRepository;
import com.alura.farmacia.repository.ProdutoRepository;

import java.util.*;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private FabricanteRepository fabricanteRepository;
    private ProdutoRepository produtoRepository;

    public Principal(FabricanteRepository fabricanteRepository) {
        this.fabricanteRepository = fabricanteRepository;
    }
    public Principal(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void exibeMenu(){

        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    =========== MENU Farmácia Senac ===========
                                    
                    Selecione uma opção:
                    -------------------------------------------
                    |                                           |
                    |1 - Cadastrar novo produto.                |
                    |2 - Listar produtos.                       |
                    |3 - Editar produto.                        |
                    |4 - Deletar produto.                       |
                    |5 - Cadastrar novo fabricante.             |
                    |6 - Sair                                   |
                    |                                           |
                    --------------------------------------------
                       """;

            System.out.println(menu);
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    editarProduto();
                    break;
                case 4:
                    deletarProduto();
                    break;
                case 5:
                    cadastrarFabricante();
                case 6:
                    System.out.println("Encerrando aplicação... Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void cadastrarProduto() {
        System.out.println("Informe o nome do fabricante: ");
        var nomeFabricante = leitura.nextLine();
        var fabricanteOptional = fabricanteRepository.findByNome(nomeFabricante);

        Fabricante fabricante;
        if (fabricanteOptional.isEmpty()) {
            fabricante = new Fabricante(new DadosFabricante(nomeFabricante));
            fabricanteRepository.save(fabricante);
        } else {
            fabricante = fabricanteOptional.get();
        }

        System.out.println("Informe o nome do produto: ");
        var nomeProduto = leitura.nextLine();

        System.out.println("Informe a descrição do produto: ");
        var descricaoProduto = leitura.nextLine();

        System.out.println("Informe o preço do produto: ");
        var precoProduto = leitura.nextDouble();

        var produto = new Produto(new DadosProduto(nomeProduto, descricaoProduto, precoProduto, fabricante));
        produtoRepository.save(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private void listarProdutos(){
        var produtos = produtoRepository.findAll();
        produtos.forEach(System.out::println);
    }

    private void editarProduto(){
        System.out.println("Informe o id do produto para editar: ");
        var id = leitura.nextInt();
        leitura.nextLine();

        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isEmpty()) {
            System.out.println("Produto não encontrado!");
        } else {
            System.out.println("Informe a descrição do produto para atualizar: ");
            var descricaoProduto = leitura.nextLine();
            var produto = produtoOptional.get();
            produto.setDescricao(descricaoProduto);
            produtoRepository.save(produto);
            System.out.println("A descrição foi atualizada com sucesso.");
        }
    }

    private void deletarProduto(){
        System.out.println("Informe o id do produto a ser deletado: ");
        var id = leitura.nextInt();
        leitura.nextLine();

        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        if (produtoOptional.isEmpty()) {
            System.out.println("Produto não encontrado!");
        } else {
            produtoRepository.deleteById(id);
            System.out.println("Produto deletado com sucesso.");
        }
    }

    private void cadastrarFabricante(){
        System.out.println("Informe o nome do fabricante: ");
        var nomeFabricante = leitura.nextLine();
        Optional<Fabricante> fabricanteOptional = fabricanteRepository.findByNome(nomeFabricante);
        Fabricante fabricante;
        if (fabricanteOptional.isEmpty()) {
            fabricante = new Fabricante(new DadosFabricante(nomeFabricante));
            fabricanteRepository.save(fabricante);
            System.out.println("Fabricante cadastrado com sucesso.");
        } else {
            System.out.println("Fabricante já cadastrado!");
        }
    }
}
public class Principal {
}
