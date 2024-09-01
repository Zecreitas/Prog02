package Aula22.buffer;

import java.io.*;

public class Exemplo2 {
    public static void main(String[]args){
        String caminho = "C:/Users/Guilherme/Documents/teste.txt";
        try{
            BufferedReader arquivo = new BufferedReader(new FileReader(caminho));
            String texto = "";
            String linha = "";
            while (linha!=null){
                linha = arquivo.readLine();
                if (linha!=null){
                    texto+=linha+"\n";
                }
            }
            System.out.println(texto);
        }
        catch (IOException e) {
            System.out.println("Não foi possivel criar o arquivo");
        }
    }
}
