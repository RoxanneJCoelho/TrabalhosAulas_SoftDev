package Ex05;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabrico;

    public Carro(String marcaTemp, String modeloTemp, String corTemp, int anoFabricoTemp) {
        marca = marcaTemp;
        modelo = modeloTemp;
        cor = corTemp;
        anoFabrico = anoFabricoTemp;
    }

    public void Ligar() {
        System.out.println("O " + marca + " " + modelo + " " + cor + " está ligado...");
    }
}
