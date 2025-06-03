package Ex03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marca;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public double cargaAtual() {
        double peso = 0.0;
        for (Peixe peixe : peixesPescados) {
            peso += peixe.getPeso();
        }
        for (Marisco marisco : mariscoPescado) {
            peso += marisco.getPeso();
        }
        return peso;
    }

    public void pescarPeixe(Peixe peixe) {
        double pesoAtual = cargaAtual();
        if (pesoAtual + peixe.getPeso() <= capacidadeCarga) {
            peixesPescados.add(peixe);
            System.out.println("Peixe " + peixe.getEspecie() + "pescado com sucesso!");
        } else {
            System.out.println("Limite da carga excedido! Não foi possível pescar");
        }
    }

    public void pescarMarisco(Marisco marisco) {
        double pesoAtual = cargaAtual();
        if (pesoAtual + marisco.getPeso() <= capacidadeCarga) {
            mariscoPescado.add(marisco);
            System.out.println("Marisco " + marisco.getEspecie() + "pescado com sucesso!");
        } else {
            System.out.println("Limite da carga excedido! Não foi possível pescar");
        }
    }
}
