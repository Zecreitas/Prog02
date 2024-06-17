package Aula20;

public class Motorista extends Funcionario {
    private String cnh;
    public Motorista(String nome, String sobrenome, int mat, String cnh){
        super(nome, sobrenome, mat);
        this.cnh = cnh;
    }
    public String getCnh(){
        return cnh;
    }
    public void setCnh(String cnh){
        this.cnh = cnh;
    }
}
