package com.brenohen.tesouro_direto_api.controller;

import com.brenohen.tesouro_direto_api.model.Produto;
import com.brenohen.tesouro_direto_api.utilities.ScrapingUtil;

import java.util.List;


public class WebScraping {

    public static void executar() {
        List<Produto> produtos = ScrapingUtil.rasparDados();
    }
}
