package com.br.core;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XML2Java {
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fabrica.newDocumentBuilder();
        Document document = builder.parse("C:\\Users\\alepq\\Documents\\modulo-mobile\\desenvolvimento\\atividade01\\exercicio01\\dados.xml");

        NodeList universidade = document.getElementsByTagName("universidade");

        for(int i=0; i<universidade.getLength();i++){
        Element fdp= (Element) universidade.item(0);
        String un1 = fdp.getTextContent();
        System.out.println(un1);
        }
    }
}
