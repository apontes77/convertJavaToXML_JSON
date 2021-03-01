package com.br.entity;



import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XStreamAlias("universidade")
public class Universidade implements Serializable {
    @Override
    public String toString() {
        return "Universidade{" +
                "id=" + id +
                ", sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", site='" + site + '\'' +
                '}';
    }

    private  Integer id;
    private  String sigla;
    private  String nome;
    private  String endereco;
    private  String site;

    public Universidade(Integer id, String sigla, String nome, String site) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.site = site;
    }

    public Universidade(){}

    public Integer getId() {
        return id;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getSite() {
        return site;
    }


    public void setId(Integer id) {
        this.id = id;
    }



    public void setSigla(String sigla) {
        this.sigla = sigla;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    public void setSite(String site) {
        this.site = site;
    }


}


