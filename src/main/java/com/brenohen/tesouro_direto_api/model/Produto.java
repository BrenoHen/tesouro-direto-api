package com.brenohen.tesouro_direto_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String rentabilidadeAnual;
    private Double investimentoMinimo;
    private Double precoUnitario;
    private Date vencimento;

    public Produto() {}

    public Produto(String nome, String rentabilidadeAnual, Double investimentoMinimo, Double precoUnitario, Date vencimento) {
        this.nome = nome;
        this.rentabilidadeAnual = rentabilidadeAnual;
        this.investimentoMinimo = investimentoMinimo;
        this.precoUnitario = precoUnitario;
        this.vencimento = vencimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRentabilidadeAnual() {
        return rentabilidadeAnual;
    }

    public void setRentabilidadeAnual(String rentabilidadeAnual) {
        this.rentabilidadeAnual = rentabilidadeAnual;
    }

    public Double getInvestimentoMinimo() {
        return investimentoMinimo;
    }

    public void setInvestimentoMinimo(Double investimentoMinimo) {
        this.investimentoMinimo = investimentoMinimo;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", rentabilidadeAnual='" + rentabilidadeAnual + '\'' +
                ", investimentoMinimo=" + investimentoMinimo +
                ", precoUnitario=" + precoUnitario +
                ", vencimento=" + sdf.format(vencimento) +
                '}';
    }
}
