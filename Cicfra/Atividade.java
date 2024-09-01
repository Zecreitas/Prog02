package Cicfra;

import java.util.Random;
import java.util.Scanner;

public class Atividade{
    public static String cifra(String frase){
        String cod = "";
        int valor = 0;
        char rLetra = ' ';
        for (int i=0;i<frase.length();i++){
            char letra = frase.charAt(i);
            for (int j=0;j<frase.length();j++){
                if (letra!=' '){
                    valor = ((int)letra)+3;
                    rLetra = (char)valor;
                }
                else{
                    rLetra = ' ';
                }
            }
            cod += rLetra;
        }
        return cod;
    }
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Random ale = new Random();
        System.out.println("Digite Algo: ");
        String frase = ler.nextLine();
        String cif = cifra(frase);
        System.out.println(cif);
    }
}
