package Aula20;

public class ContaPoupança extends Conta{
    public ContaPoupança(String titular, String id, float saldo, String senha){
        super(titular,id,saldo,senha);
    }
    public boolean sacar(float valor){
        if (saldo<valor)
            return false;
        else
            return true;
    }
    public String vereficaSalso(){
        return ""+saldo;
    }
}
