package controller;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import semana09.senac.model.Produto;
import semana09.senac.produto.DadosAtualizaProduto;
import semana09.senac.produto.DadosListarProduto;
import semana09.senac.produto.DadosCadastroProduto;
import semana09.senac.repository.FabricanteRepository;
import semana09.senac.repository.ProdutoRepository;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private FabricanteRepository fabricanteRepository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        fabricanteRepository.save(dados.fabricante());
        produtoRepository.save(new Produto(dados,dados.fabricante() ));
    }

    @GetMapping
    public List<DadosListarProduto> listar() {
        return produtoRepository.findAll().stream().map(DadosListarProduto::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizaProduto dados){
        var medico = produtoRepository.getReferenceById(dados.id());
        medico.atualizarInformacao(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Integer id){
        produtoRepository.deleteById(id);
    }
}