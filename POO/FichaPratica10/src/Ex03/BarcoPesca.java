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
            System.out.println(peixe.getPeso() + "kg do peixe " + peixe.getEspecie() + "pescado com sucesso!");
        } else {
            System.out.println("Limite da carga excedido do " + this.nome + "! Não foi possível pescar " + peixe.getEspecie());
        }
    }

    public void pescarMarisco(Marisco marisco) {
        double pesoAtual = cargaAtual();
        if (pesoAtual + marisco.getPeso() <= capacidadeCarga) {
            mariscoPescado.add(marisco);
            System.out.println(marisco.getPeso() + "kg do Marisco " + marisco.getEspecie() + "pescado com sucesso!");
        } else {
            System.out.println("Limite da carga excedido do " + this.nome + "! Não foi possível pescar " + marisco.getEspecie());
        }
    }

    public void largarPeixe(int posicao) {
        if (posicao >= 0 && posicao < peixesPescados.size()) {
            Peixe removido = peixesPescados.remove(posicao);
            System.out.println("Peixe largado: " + removido.getEspecie());
        } else {
            System.out.println("Posição inválida! Nenhum peixe foi largado.");
        }
    }

    public void largarMarisco(int posicao) {
        if (posicao >= 0 && posicao < mariscoPescado.size()) {
            Marisco removido = mariscoPescado.remove(posicao);
            System.out.println("Marisco largado: " + removido.getEspecie());
        } else {
            System.out.println("Posição inválida! Nenhum peixe foi largado.");
        }
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Peixe peixe : peixesPescados) {
            total += peixe.getPeso() * peixe.getPrecoKg();
        }

        for (Marisco marisco : mariscoPescado) {
            total += marisco.getPeso() * marisco.getPrecoKg();
        }

        return total;

    }
    public double salarioTripulado(){
        double total = calcularTotal();
        double valorDistribuido = total * 0.60; // 60% para os tripulantes
        return valorDistribuido / this.tripulacao;

    }
}
