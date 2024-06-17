package Aula20;

public class ContaCorrente extends Conta{
    private float limite;
    public ContaCorrente(String titular, String id, float saldo, String senha, float limite){
        super(titular,id,saldo,senha);
        this.limite = limite;
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
