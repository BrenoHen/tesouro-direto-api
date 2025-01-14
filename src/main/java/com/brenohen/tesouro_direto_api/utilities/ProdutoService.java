package com.brenohen.tesouro_direto_api.utilities;

import com.brenohen.tesouro_direto_api.model.Produto;
import com.brenohen.tesouro_direto_api.repository.ProdutoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostConstruct
    public void init() {
        List<Produto> produtos = ScrapingUtil.rasparDados();
        inserirProdutosNoBanco(produtos);
    }

    // SALVANDO NO BANCO COM JPA
    private void inserirProdutosNoBanco(List<Produto> produtos) {
        for (Produto produto : produtos){
            produtoRepository.save(produto);
            System.out.println(produto);
        }
    }

    // CONSULTANDO TODOS OS TITULOS NO BANCO COM JPA
    public List<Produto> getProdutos() {
        return produtoRepository.findAll();
    }

    // CONSULTANDO TITULO POR ID NO BANCO COM JPA
    public Optional<Produto> consultaProdutoPorId(Long id) {
        return produtoRepository.findById(id);
    }
}
