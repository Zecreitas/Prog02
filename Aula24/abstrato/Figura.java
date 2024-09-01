package Aula24.abstrato;

public abstract class Figura {
    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    private String nomeFigura;

    public abstract double calculaArea();
    public abstract double calcularPer();

}
