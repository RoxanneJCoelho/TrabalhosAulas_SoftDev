package Ex04;

public class Circulo {
    private String cor;
    private double raio;

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public double getArea() {
        return 3.14 * this.raio * this.raio;
    }

    public double getPerimetro() {
        return 3.14 * this.raio * 2;

    }
}
