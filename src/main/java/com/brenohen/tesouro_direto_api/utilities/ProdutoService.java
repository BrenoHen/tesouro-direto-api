package com.brenohen.tesouro_direto_api.utilities;

import com.brenohen.tesouro_direto_api.model.Produto;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private List<Produto> produtos;

    @PostConstruct
    public void init() {
        produtos = ScrapingUtil.rasparDados();
        inserirProdutosNoBanco();
    }

    private void inserirProdutosNoBanco() {
        for (Produto produto : produtos){
            jdbcTemplate.update(
                    "INSERT INTO PRODUTO (NOME, RENTABILIDADE_ANUAL, INVESTIMENTO_MINIMO, PRECO_UNITARIO, VENCIMENTO) VALUES (?, ?, ?, ?, ?)",
                    produto.getNome(), produto.getRentabilidadeAnual(), produto.getInvestimentoMinimo(), produto.getPrecoUnitario(), new java.sql.Date(produto.getVencimento().getTime())
            );
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
