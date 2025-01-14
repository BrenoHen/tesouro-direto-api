package com.brenohen.tesouro_direto_api.repository;

import com.brenohen.tesouro_direto_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
