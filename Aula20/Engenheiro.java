package Aula20;

public class Engenheiro extends Funcionario{
    private String crea;
    public Engenheiro(String nome, String sobrenome, int mat, String crea){
        super(nome, sobrenome, mat);
        this.crea = crea;
    }
    public String getCrea(){
        return crea;
    }
    public void setCrea(String cnh){
        this.crea = crea;
    }

}
