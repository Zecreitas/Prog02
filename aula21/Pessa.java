package aula21;

public class Pessa {
    private String sobrenome;
    private String nome;
    public Pessa(String nome, String sobrenome) {
        this.nome =nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
