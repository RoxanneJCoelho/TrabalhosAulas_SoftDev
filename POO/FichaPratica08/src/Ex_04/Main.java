package Ex_04;

public class Main {
    public static void main(String[] args) {
        Circulo circ1 = new Circulo("Azul", 4.5);
        Circulo circ2 = new Circulo("Vermelho", 8.3);

        System.out.println("Area circ1: " + circ1.calcularArea());
        System.out.println("Area circ2: " + circ2.calcularArea());
        System.out.println("Perimetro circ1: " + circ1.calcularPerimetro());
        System.out.println("Perimetro circ2: " + circ2.calcularPerimetro());
    }
}
