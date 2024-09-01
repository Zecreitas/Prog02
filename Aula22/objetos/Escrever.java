package Aula22.objetos;

import java.io.*;
import java.util.Scanner;

public class Escrever {
    public static void main(String[]args){
        File arquivo = new File("C:/Users/Guilherme/Documents/pessoadb");
        try {
            Scanner ler = new Scanner(System.in);
            ObjectOutputStream escrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsoluteFile()));
            Pessoa c1 = new Pessoa();
            c1.setNome("Gui");
            c1.setSobrenome("Schuh");
            c1.setCpf("1111111111111");
            escrita.writeObject(c1);
            System.out.println("Pessoa "+c1.getNome()+" salva com sucesso");
        }
        catch (IOException e){
            System.out.println("não foi salva");
        }
    }
}
