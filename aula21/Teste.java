package aula21;

public class Teste {
    public static void main(String[]args){
        Expoli c1 = new Expoli();
        System.out.println("Somando dois números: "+c1.soma(5, 3));
        System.out.println("Somando três números: "+c1.soma(5, 3, 6));
        System.out.println("Somando duas Strings: "+c1.soma("5", "3"));
    }
}
