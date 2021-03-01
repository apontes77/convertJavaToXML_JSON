package com.br.core;

import com.br.entity.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java2Json {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Universidade universidade = new Universidade();
        Curso curso1 = new Curso();

        Professor professor1 = new Professor();

        Aluno aluno1 = new Aluno();


        universidade.setId(1);
        universidade.setNome("PUC GOIAS");
        universidade.setSigla("PUC");
        universidade.setSite("pucgoias.edu.br");
        universidade.setEndereco("Av. Universitária, s/n, Setor Leste Universitário");

        curso1.setId(1);
        curso1.setNome("Ciência da Computação");
        curso1.setSigla("CMP1234");


        professor1.setId(1);
        professor1.setNome("Juscelino");
        professor1.setCpf("123.456.789-43");
        professor1.setEnderecos(Arrays.asList("Av. Universitária"));
        professor1.setTelefones(Arrays.asList("(23)123456789"));

        aluno1.setId(1);
        aluno1.setNome("Steve Jobs");
        aluno1.setCpf("123.123.123-43");
        aluno1.setDataNascimento("01-01-1954");
        aluno1.setTelefones(Arrays.asList("(62)145639871"));
        aluno1.setEnderecos(Arrays.asList("Av. Ipiranga, s/n"));


        curso1.setAlunos((Arrays.asList(aluno1)));
        curso1.setProfessores(Arrays.asList(professor1));

        String json = gson.toJson(curso1);

        System.out.println(json);
    }
    }
