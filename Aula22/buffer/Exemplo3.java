package Aula22.buffer;

import java.io.File;

public class Exemplo3 {
    public static void main(String[]args){
        File caminho = new File("C:/Users/Guilherme/Documents/");
        if (caminho.exists())
            System.out.println("A pasta "+caminho.getAbsolutePath()+" Existe");
        else
        {
            System.out.println("A pasta "+caminho.getAbsolutePath()+" não existe");
            System.out.println("Criando pasta");
            if (caminho.mkdirs())
                System.out.println("[ok]");
            else
                System.out.println("[fail]");
        }
    }
}
