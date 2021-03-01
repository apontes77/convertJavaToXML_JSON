package com.br.core;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.br.entity.*;
import com.google.gson.Gson;


public class Json2Java {
    public static void main(String[] args)  {
        File file = new File("C:\\Users\\alepq\\Documents\\modulo-mobile\\desenvolvimento\\atividade01\\exercicio01\\dados.json");

        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("C:\\Users\\alepq\\Documents\\modulo-mobile\\desenvolvimento\\atividade01\\exercicio01\\dados.json"));
            Universidade u = gson.fromJson(br, Universidade.class);
            System.out.println(u);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
