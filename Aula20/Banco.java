package Aula20;

public class Banco {
    public static void main(String[]args){
        ContaCorrente m1 = new ContaCorrente("eu","1231",1000,"123", 123141);
        ContaPoupança e1 = new ContaPoupança("ele","432",123123,"321");
        m1.depositar(123);
        e1.depositar(123);
        m1.validaAcesso("132w1","123");
        e1.validaAcesso("432","321");
        m1.Sacar(123132);
        e1.sacar(123);
    }
}
