package Aula22.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[]args){
        String caminho = "C:/Users/Guilherme/Documents/teste.txt";
        try{
            BufferedWriter arquivo = new BufferedWriter(new FileWriter(caminho));
            for (int i=0; i<10;i++){
                arquivo.append("Linha "+i+" do arquivo\n");
            }
            arquivo.close();
        }
        catch (IOException e) {
            System.out.println("Não foi possivel criar o arquivo");
        }
    }
}
