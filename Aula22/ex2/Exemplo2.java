package Aula22.ex2;

public class Exemplo2 {
    public static void main(String [] args){
        Operacoes op = new Operacoes();
        try {
            op.divide(0, 0);
        }
        catch (ArithmeticException erro){
            System.out.println("erro");
        }
    }
}
