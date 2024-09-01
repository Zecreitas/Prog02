package Aula24.figuraInter;

public class Circulo implements Figura {
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    private double raio;

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    private String nomeFigura;


    @Override
    public double calculaArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calcularPer() {
        return 2*Math.PI*raio;
    }
}
