package Aula22.ex2;

public class Operacoes {
    public int divide(int n1, int n2) throws ArithmeticException{
        if (n1==0){
            throw new ArithmeticException("não foi possivel fazer a divisão");
        }
        return n1/n2;
    }
}
