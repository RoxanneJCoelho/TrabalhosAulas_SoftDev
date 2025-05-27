package Ex03;

public class Retangulo {
    private String cor;
    private double largura;
    private double altura;

    /**
     * Método construtor para Retângulo
     * @param cor  Cor do Retângulo
     * @param largura  Largura do Retângulo (m.)
     * @param altura  Altura do Retângulo
     */
    public Retangulo(String cor, double largura, double altura) {
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
    }

    public double getArea () {
        return this.largura * this.altura;
    }

    public double getPerimetro () {
        return this.largura + this.altura + this.largura + this.altura;
    }
}
