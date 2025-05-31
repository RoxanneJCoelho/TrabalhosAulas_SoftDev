package Ex_04;

public class Circulo {
    private String cor;
    private double raio;

    /**
     * Método construtor para Circulo
     * @param cor Cor do Circulo
     * @param raio Raio do Círculo (m.)
     */

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public double calcularArea() {
        return Math.PI * this.raio * this.raio;
    }
}
