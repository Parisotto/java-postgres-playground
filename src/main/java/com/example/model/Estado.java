package com.example.model;

public class Estado {
    private Long id;
    private String nome;
    private String uf;
    private RegioGeografica regiao;
    private int arealKm2;
    private int populacao;
    
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
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public RegioGeografica getRegiao() {
        return regiao;
    }
    public void setRegiao(RegioGeografica regiao) {
        this.regiao = regiao;
    }
    public int getArealKm2() {
        return arealKm2;
    }
    public void setArealKm2(int arealKm2) {
        this.arealKm2 = arealKm2;
    }
    public int getPopulacao() {
        return populacao;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String toString(){
        return "UF: " + uf + " | Id: " + id + " | Estado: " + nome;
    }
}
