package Aula22.exover;

public class Aluno extends Pessoa {
    private String mat;
    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String obterDados(){
        String retorno = "Nome: "+getNome()+" "+getSobrenome();
        retorno += "\nIdade: "+getIdade();
        retorno += "\n Matrícula: "+mat;
        return retorno;
    }

    public Aluno(String nome, String sobrenome) {
        super(nome, sobrenome);
        this.mat = mat;
    }
}
