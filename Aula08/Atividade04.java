package Aula08;

import java.util.Random;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Conta pessoa = new Conta();
        String op = "";
        System.out.println("Qual é o seu nome? ");
        pessoa.titular = ler.next();
        pessoa.id = new Random().nextInt(1000,10000);
        System.out.println("Quanto de saldo você tem? ");
        pessoa.saldo = ler.nextInt();
        do{
            System.out.println("Selecione uma opção");
            System.out.println("d - Depositar um valor");
            System.out.println("c - Sacar um valor");
            System.out.println("s - sair");
            op = ler.next();
            if (op.equals("d")){
                System.out.println("Quanto você quer depositar? ");
                int valor = ler.nextInt();
                pessoa.depositar(valor);
                System.out.println("saldo disponivel: "+pessoa.saldo);
            }
            if (op.equals("c")){
                System.out.println("Quanto você quer sacar? ");
                int valor = ler.nextInt();
                if(pessoa.sacar(valor)==true){
                    pessoa.saldo -=valor;
                    System.out.println("Você consegiu sacar");
                    System.out.println("saldo disponivel: "+pessoa.saldo);
                }
                else if(pessoa.sacar(valor)==false){
                    System.out.println("Você não tem essa quantia para sacar");
                    System.out.println("saldo disponivel: "+pessoa.saldo);
                }
            }
        }
        while (!op.equals("s"));
    }
}
