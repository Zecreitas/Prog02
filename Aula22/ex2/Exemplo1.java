package Aula22.ex2;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String [] args){
        int op = 2;
        do {
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite um número: ");
                int num = ler.nextInt();
                System.out.println("Digite outro número: ");
                int numDois = ler.nextInt();
                int resul = num/numDois;
                System.out.println(resul);
                op = 1;
            }
            catch (java.util.InputMismatchException erro){
                System.out.println("Você deve digitar um número não uma letra");
                op=2;
            }
            catch (ArithmeticException erro){
                System.out.println("o número não pode ser dividido por zero");
                op=2;
            }
        }while (op==2);

    }
}
