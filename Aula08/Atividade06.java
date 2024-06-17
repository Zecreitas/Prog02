package Aula08;

import java.util.Random;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Conta[] pessoa = new Conta[20];
        int cont =0;
        String op = "";
        do{
            System.out.println("Selecione uma opção");
            System.out.println("a - Adicionar uma conta");
            System.out.println("d - Depositar um valor");
            System.out.println("c - Sacar um valor");
            System.out.println("l - Listar Conta");
            System.out.println("s - sair");
            op = ler.next();
            if (op.equals("a")){
                pessoa[cont] = new Conta();
                System.out.println("Qual é o seu nome? ");
                pessoa[cont].titular = ler.next();
                System.out.println("Qual é a sua senha? ");
                pessoa[cont].senha = ler.next();
                pessoa[cont].id = new Random().nextInt(1000,10000);
                System.out.println("Sua identificação: "+pessoa[cont].id);
                System.out.println("Quanto de saldo você tem? ");
                pessoa[cont].saldo = ler.nextInt();
                cont++;
            }
            if (op.equals("d")){
                System.out.println("Digite o id da conta que você quer depositar: ");
                int cod = ler.nextInt();
                System.out.println("Digite a senha da conta que você quer acessar: ");
                String sen = ler.next();
                for(int i=0;i<cont;i++){
                    if (cod==pessoa[i].id && sen.equals(pessoa[i].senha)){
                        System.out.println("Quanto você quer depositar? ");
                        int valor = ler.nextInt();
                        pessoa[i].depositar(valor);
                        System.out.println("saldo disponivel: "+pessoa[i].saldo);
                    }
                }
            }
            if (op.equals("c")){
                System.out.println("Digite o id da conta que você quer sacar: ");
                int cod = ler.nextInt();
                System.out.println("Digite a senha da conta que você quer acessar: ");
                String sen = ler.next();
                for(int i=0;i<cont;i++){
                    if (cod==pessoa[i].id && sen.equals(pessoa[i].senha)){
                        System.out.println("Quanto você quer sacar? ");
                        int valor = ler.nextInt();
                        if(pessoa[cont].sacar(valor)==true){
                            pessoa[cont].saldo -=valor;
                            System.out.println("Você consegiu sacar");
                            System.out.println("saldo disponivel: "+pessoa[cont].saldo);
                        }
                        else if(pessoa[cont].sacar(valor)==false){
                            System.out.println("Você não tem essa quantia para sacar");
                            System.out.println("saldo disponivel: "+pessoa[cont].saldo);
                        }
                    }
                }
            }
            if (op.equals("l")){
                for (int i =0;i<cont;i++){
                    System.out.println("\n\nTitular: "+pessoa[i].titular);
                    System.out.println("Id: "+pessoa[i].id);
                    System.out.println("Saldo: "+pessoa[i].saldo+"\n\n\n");
                }
            }
        }
        while (!op.equals("s"));
    }
}
