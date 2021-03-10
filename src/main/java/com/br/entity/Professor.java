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
    @XStreamAlias("enderecos")
    private  List<String> enderecos = new ArrayList<>();
    @XStreamAlias("telefones")
    private  List<String> telefones = new ArrayList<>();


    public Professor(Integer id, String cpf, String nome, List<String> telefones, List<String> enderecos) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefones = telefones;
        this.enderecos = enderecos;
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
