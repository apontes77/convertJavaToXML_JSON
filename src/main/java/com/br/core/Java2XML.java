package com.br.core;

import com.br.entity.Aluno;
import com.br.entity.Curso;
import com.br.entity.Professor;
import com.br.entity.Universidade;
import com.thoughtworks.xstream.XStream;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Java2XML {

    public static void main(String[] args) throws IOException {
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

        professor1.setCurso((curso1));
        aluno1.setCurso(curso1);

        curso1.setAlunos((Arrays.asList(aluno1)));
        curso1.setProfessores(Arrays.asList(professor1));

        XStream xStream = new XStream();
        xStream.alias("universidade", Universidade.class);
        xStream.alias("curso1", Curso.class);
        xStream.alias("aluno1", Aluno.class);
        xStream.alias("professor1", Professor.class);

        System.out.println(xStream.toXML(universidade));
        System.out.println(xStream.toXML(curso1));
        System.out.println(xStream.toXML(aluno1));
        System.out.println(xStream.toXML(professor1));

    }
}


