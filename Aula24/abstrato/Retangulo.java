package Aula24.abstrato;

public class Retangulo extends Figura{
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double base;
    private double altura;
    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public double calcularPer() {
        return (base*base)+(altura*altura);
    }

}
