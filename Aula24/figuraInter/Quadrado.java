package Aula24.figuraInter;

public class Quadrado implements Figura {
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private double lado;
    @Override
    public double calculaArea() {
        return lado*lado*lado*lado;
    }

    @Override
    public double calcularPer() {
        return lado*lado;
    }
    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    private String nomeFigura;
}
