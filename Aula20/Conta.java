package Aula20;

public class Conta {
    private String titular;
    private String id;
    protected float saldo;
    private String senha;
    public Conta(String titular, String id, float saldo, String senha){
        this.titular = titular;
        this.id = id;
        this.saldo = saldo;
        this.senha = senha;
    }
    public void depositar(float valor){
        this.saldo +=valor;
    }
    private String geralidentificador(){
        return id;
    }
    public boolean validaAcesso(String id, String senha){
        if(this.id==id){
            if (this.senha==senha){
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
}
