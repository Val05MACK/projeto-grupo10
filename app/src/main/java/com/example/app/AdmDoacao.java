package com.example.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doacoes")
public class AdmDoacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String solicitanteDoacao;
    private String descricao;
    private double meta;

    public AdmDoacao() {}
    public AdmDoacao(String solicitanteDoacao, String descricao, double meta) {
        this.solicitanteDoacao = solicitanteDoacao;
        this.descricao = descricao;
        this.meta = meta;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSolicitanteDoacao() {
        return solicitanteDoacao;
    }

    public void setSolicitanteDoacao(String solicitanteDoacao) {
        this.solicitanteDoacao = solicitanteDoacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    
}
