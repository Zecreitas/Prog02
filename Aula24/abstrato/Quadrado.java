package Aula24.abstrato;

public class Quadrado extends Figura{
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
}
