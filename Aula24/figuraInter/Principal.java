package Aula24.figuraInter;


public class Principal {
    public static void main(String[]args){
        Circulo c1 = new Circulo();
        c1.setNomeFigura("Círculo");
        c1.setRaio(5);
        System.out.println("O "+c1.getNomeFigura());
        System.out.println("Tem uma área de: "+c1.calculaArea());
        System.out.println("E um perimetro de: "+c1.calcularPer());
        Quadrado c2 = new Quadrado();
        c2.setNomeFigura("Quadrado");
        c2.setLado(4);
        System.out.println("\nO "+c2.getNomeFigura());
        System.out.println("Tem uma área de: "+c2.calculaArea());
        System.out.println("E um perimetro de: "+c2.calcularPer());
        Retangulo c3 = new Retangulo();
        c3.setNomeFigura("Quadrado");
        c3.setBase(4);
        c3.setAltura(10);
        System.out.println("\nO "+c3.getNomeFigura());
        System.out.println("Tem uma área de: "+c3.calculaArea());
        System.out.println("E um perimetro de: "+c3.calcularPer());
    }
}
