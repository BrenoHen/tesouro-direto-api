package com.brenohen.tesouro_direto_api.model;

import jakarta.persistence.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {
    private String nome;
    private String rentabilidadeAnual;
    private Double investimentoMinimo;
    private Double precoUnitario;
    private Date vencimento;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Produto(String nome, String rentabilidadeAnual, Double investimentoMinimo, Double precoUnitario, Date vencimento) {
        this.nome = nome;
        this.rentabilidadeAnual = rentabilidadeAnual;
        this.investimentoMinimo = investimentoMinimo;
        this.precoUnitario = precoUnitario;
        this.vencimento = vencimento;
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

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", rentabilidadeAnual='" + rentabilidadeAnual + '\'' +
                ", investimentoMinimo=" + investimentoMinimo +
                ", precoUnitario=" + precoUnitario +
                ", vencimento=" + sdf.format(vencimento) +
                '}';
    }
}