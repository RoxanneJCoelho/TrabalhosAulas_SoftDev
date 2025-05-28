package Ex05;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabrico;

    public Carro(String marca, String modelo, String cor, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
    }

    public void Ligar() {
        System.out.println("O " + this.marca + " " + this.modelo + " " + this.cor + " está ligado...");
    }
}
