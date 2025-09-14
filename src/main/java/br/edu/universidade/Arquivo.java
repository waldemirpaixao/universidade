package br.edu.universidade;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;

public class Arquivo {

    public static void main(String[] args) {

        
       

        File arquivo = new File("CHANGELOG.md");

        System.out.println(FileSystems.getDefault().getPath("CHANGELOG.md").toString());

        try {

            if (arquivo.exists()) {

                System.out.println("Arquivo já existe: " + arquivo.getAbsolutePath());
            } else {

                System.out.println("O arquivo nçao existe: " + arquivo.getAbsolutePath());
                boolean criado = arquivo.createNewFile();
                if (criado) {
                    System.out.println("Arquivo criado com sucesso: " + arquivo.getAbsolutePath());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();;
        }

    }

}
