package Aula20;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private int mat;

    public String getNome(){
        return  nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return  sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.nome = nome;
    }
    public int getMat(){
        return  mat;
    }
    public void setMat(int mat){
        this.mat = mat;
    }
    public Funcionario(String nome, String sobrenome, int mat){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.mat = mat;
    }

}
