package Aula20;

import java.util.Random;
import java.util.Scanner;

public class Banco {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Conta[] pessoa = new Conta[20];
        int cont =0;
        String op = "";
        do{
            System.out.println("Selecione uma opção");
            System.out.println("a - Adicionar uma conta");
            System.out.println("l - Listar Conta");
            System.out.println("s - sair");
            op = ler.next();
            if (op.equals("a")){
                pessoa[cont] = new Conta("eu", "1233", 124, "123");
                System.out.println("Qual é o seu nome? ");
                pessoa[cont].titular = ler.next();
                System.out.println("Qual é a sua senha? ");
                pessoa[cont].setSenha(ler.next());
                pessoa[cont].setId(String.valueOf(new Random().nextInt(1000, 10000)));
                System.out.println("Sua identificação: "+ pessoa[cont].getId());
                System.out.println("Quanto de saldo você tem? ");
                pessoa[cont].saldo = ler.nextInt();
                cont++;
            }
            if (op.equals("l")){
                for (int i =0;i<cont;i++){
                    System.out.println("\n\nTitular: "+pessoa[i].titular);
                    System.out.println("Id: "+ pessoa[i].getId());
                    System.out.println("Saldo: "+pessoa[i].saldo+"\n\n\n");
                }
            }
        }
        while (!op.equals("s"));
    }
}
