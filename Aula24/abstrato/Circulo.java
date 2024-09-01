package Aula24.abstrato;

public class Circulo extends Figura{
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    private double raio;

    @Override
    public double calculaArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calcularPer() {
        return 2*Math.PI*raio;
    }
}
