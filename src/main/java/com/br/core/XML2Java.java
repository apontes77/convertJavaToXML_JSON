package com.br.core;


import com.br.entity.Aluno;
import com.br.entity.Curso;
import com.br.entity.Professor;
import com.br.entity.Universidade;
import com.thoughtworks.xstream.XStream;

import java.util.Arrays;

public class XML2Java {
    public static void main(String[] args)   {
        Universidade universidade =
                new Universidade(1, "PUC GOIAS", "PUC", "pucgoias.edu.br", "Av. Universitária, s/n, Setor Leste Universitário");
        Curso curso1 = new Curso(1,"CMP1234", "Ciência da Computação");
        Professor professor1 =
                new Professor(1, "123.456.789-43", "Juscelino", Arrays.asList("Av. Universitária"), Arrays.asList("(23)123456789"));
        Aluno aluno1 =
                new Aluno(1, "Steve Jobs", "123.123.123-43", "01-01-1954", Arrays.asList("(62)145639871"), Arrays.asList("Av. Ipiranga, s/n"));


        Professor professor2 =
                new Professor(1, "123.456.789-43", "Jobs", Arrays.asList("Av. Universitária"), Arrays.asList("(23)123456789"));
        Aluno aluno2 =
                new Aluno(1, "Gates", "123.123.123-43", "01-01-1954", Arrays.asList("(62)145639871"), Arrays.asList("Av. Ipiranga, s/n"));


        curso1.setAlunos((Arrays.asList(aluno1, aluno2)));
        curso1.setProfessores(Arrays.asList(professor1, professor2));

        universidade.setCursos(Arrays.asList(curso1));

        XStream xStream = new XStream();
        xStream.processAnnotations(Universidade.class);
        xStream.processAnnotations(Curso.class);
        xStream.processAnnotations(Professor.class);
        xStream.processAnnotations(Aluno.class);

        xStream.alias("universidade",Universidade.class);
        xStream.alias("curso",Curso.class);
        xStream.alias("professor", Professor.class);
        xStream.alias("aluno", Aluno.class);

        xStream.addImplicitCollection(Universidade.class, "cursos");
        xStream.addImplicitCollection(Curso.class, "professores");
        xStream.addImplicitCollection(Curso.class, "alunos");
        xStream.addImplicitCollection(Aluno.class, "enderecos");
        xStream.addImplicitCollection(Aluno.class, "telefones");
        xStream.addImplicitCollection(Professor.class, "enderecos");
        xStream.addImplicitCollection(Professor.class, "telefones");


//        String objJavaToXMLUniversidade = xStream.toXML(universidade);
//        String objJavaToXMLAluno1 = xStream.toXML(aluno1);
//        String objJavaToXMLAluno2 = xStream.toXML(aluno2);
//        String objJavaToXMLProf1 = xStream.toXML(professor1);
//        String objJavaToXMLProf2 = xStream.toXML(professor2);
//        String objJavaToXMLCurso = xStream.toXML(curso1);

        Universidade objXMLToJava1 = (Universidade) xStream.fromXML(xStream.toXML(universidade));
        Aluno objXMLToJava2 = (Aluno) xStream.fromXML(xStream.toXML(aluno1));

        System.out.println(objXMLToJava1);
    }
}
