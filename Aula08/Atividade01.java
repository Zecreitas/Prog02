package Aula08;

public class Atividade01 {
    public static  void main(String[]args){
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();
        Lampada l3 = new Lampada();

        l1.cor = "vermelho";
        l1.ligada = true;
        l1.marca = "zé";
        l1.modelo = "A21";
        l1.local = "Ali";
        l1.desligar();
        l1.ligar();
        System.out.println(l1.obterDados()+"\n\n");
        l2.cor = "Amarelo";
        l2.ligada = false;
        l2.marca = "lg";
        l2.modelo = "A22";
        l2.local = "Aqui";
        l2.desligar();
        l2.ligar();
        System.out.println(l2.obterDados()+"\n\n");
        l3.cor = "roxo";
        l3.ligada = false;
        l3.marca = "lg";
        l3.modelo = "A92";
        l3.local = "sla";
        l3.desligar();
        l3.ligar();
        System.out.println(l3.obterDados()+"\n\n");
    }
}
