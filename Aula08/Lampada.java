package Aula08;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    String local;
    boolean ligada;

    void ligar(){
        if (ligada){
            System.out.println("A lâmpada já está ligada: ");
        }
        else
            System.out.println("Você ligou a lâmpada: ");
    }
    void desligar(){
        if (ligada)
            System.out.println("Você desligou a lãmpada: ");
        else
            System.out.println("A lâmpada já está desligada: ");
    }
    boolean estaLigado(){
        if (ligada)
            return true;
        else
            return false;
    }
    String obterDados(){
        return "Marca: "+marca+";\nCor: "+cor+";\nModelo: "+modelo+";\nLocal: "+local+";";
    }
}
