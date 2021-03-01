package com.br.entity;


import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias("professor")
public class Professor implements Serializable {
    private  Integer id;
    private  String cpf;
    private  String nome;

    private  List<String> enderecos = new ArrayList<>();

    private  List<String> telefones = new ArrayList<>();

    public  Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    private Curso curso;


    public Professor(Integer id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Professor() {
    }



    public void setId(Integer id) {
        this.id = id;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setEnderecos(List<String> enderecos) {
        this.enderecos = enderecos;
    }


    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }

    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getEnderecos() {
        return enderecos;
    }

    public List<String> getTelefones() {
        return telefones;
    }
}
