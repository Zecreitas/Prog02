package Aula22.objetos;

import java.io.*;

public class Leitura {
    public static void main(String[]args){
        File arquivo = new File("C:/Users/Guilherme/Documents/pessoadb");
        try {
            ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsoluteFile()));
            Pessoa c1 = (Pessoa) leitura.readObject();
            System.out.println(c1);
        }
        catch (FileNotFoundException e){
            System.out.println("Erro ao ler");
        }
        catch (IOException e){
            System.out.println("Erro ao ler");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Erro ao ler");
        }
    }
}
