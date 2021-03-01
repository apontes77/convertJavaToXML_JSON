package com.br.entity;


import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@XStreamAlias("aluno")
public class Aluno implements Serializable {

    private  String cpf;


    private  String nome;


    private  String dataNascimento;


    private  List<String> enderecos = new ArrayList<>();
    private List<String> telefones = new ArrayList<>();

    private  Curso curso;


    private  Integer id;

    public Aluno(Integer id, String cpf, String nome, String dataNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Aluno() {
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public List<String> getEnderecos() {
        return enderecos;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public Curso getCurso() {
        return curso;
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


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



    public void setCurso(Curso curso) {
        this.curso = curso;
    }



    public void setEnderecos(List<String> enderecos) {
        this.enderecos = enderecos;
    }



    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }
}
