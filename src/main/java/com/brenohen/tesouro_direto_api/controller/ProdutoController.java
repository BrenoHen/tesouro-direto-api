package com.brenohen.tesouro_direto_api.controller;

import com.brenohen.tesouro_direto_api.model.Produto;
import com.brenohen.tesouro_direto_api.utilities.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/consulta")
    public List<Produto> getProdutos() {
        return produtoService.getProdutos();
    }

    @GetMapping("/consulta/{id}")
    public Produto consultaProdutoPorId(@PathVariable("id") Long id) {
        return produtoService.consultaProdutoPorId(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado com ID: " + id));
    }
}
