package com.brenohen.tesouro_direto_api.controller;

import com.brenohen.tesouro_direto_api.model.Produto;
import com.brenohen.tesouro_direto_api.utilities.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    @RequestMapping("consulta")
    public List<Produto> getProdutos() {
        return produtoService.getProdutos();
    }


}
