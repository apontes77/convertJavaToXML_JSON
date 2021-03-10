package com.br.entity;



import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@XStreamAlias("universidade")
public class Universidade implements Serializable {


    private  Integer id;
    private  String sigla;
    private  String nome;
    private  String endereco;
    private  String site;
    @XStreamImplicit
    @XStreamAlias("cursos")
    private List<Curso> cursos = new ArrayList<>();

    public Universidade(Integer id, String sigla, String nome, String site, String endereco) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.site = site;
        this.endereco = endereco;
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

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


}


