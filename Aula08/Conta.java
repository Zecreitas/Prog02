package Aula08;

public class Conta {
    String titular;
    int id;
    float saldo;
    String senha;

    void depositar(float valor){
        this.saldo+=valor;
    }
    boolean sacar(float valor){
        if(valor<=saldo){
            return true;
        }
        else
            return false;
    }
}
