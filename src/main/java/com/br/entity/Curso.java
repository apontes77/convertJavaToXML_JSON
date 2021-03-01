package com.br.entity;


import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XStreamAlias("curso")
public class Curso implements Serializable {
    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                ", professores=" + professores +
                ", alunos=" + alunos +
                '}';
    }

    private  Integer id;
    private  String sigla;
    private  String nome;

    private  List<Professor> professores = new ArrayList<>();

    private  List<Aluno> alunos = new ArrayList<>();

    public Curso(Integer id, String sigla, String nome) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
    }

    public Curso() {
    }

    public Integer getId() {
        return id;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
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



    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }



    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
