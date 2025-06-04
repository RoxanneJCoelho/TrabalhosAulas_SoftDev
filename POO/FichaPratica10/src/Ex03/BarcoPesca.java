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

// maneira do stor
    public void pescarPeixe(Peixe peixe) {
        if (this.cargaAtual() + peixe.getPeso() <= this.capacidadeCarga) {
            // Barco pode com o peixe novo, já tendo em conta a carga atual (o que já está pescado)
            this.peixesPescados.add(peixe);
            System.out.println(peixe.getPeso() + " Kg. de " + peixe.getEspecie() + " pescados.");
        } else {
            // Barco não tem capacidade para aguentar com este peixe novo
            System.out.println("O " + this.nome + " não tem capacidade para pescar " + peixe.getEspecie());
        }
    }

    // maneira do chatgpt
    public void pescarMarisco(Marisco marisco) {
        double pesoAtual = cargaAtual();
        if (pesoAtual + marisco.getPeso() <= capacidadeCarga) {
            mariscoPescado.add(marisco);
            System.out.println(marisco.getPeso() + "kg do Marisco " + marisco.getEspecie() + "pescado com sucesso!");
        } else {
            System.out.println("Limite da carga excedido do " + this.nome + "! Não foi possível pescar " + marisco.getEspecie());
        }
    }

    public void largarPeixe(Peixe peixeLargar) {
        this.peixesPescados.remove(peixeLargar);
        System.out.println(peixeLargar.getEspecie() + " largados...");
    }

    public void largarMarisco(Marisco mariscoLargar) {
        this.mariscoPescado.remove(mariscoLargar);
        System.out.println(mariscoLargar.getEspecie() + " largados...");
    }

    public double calcularTotal(){
        double total = 0;
        for (Peixe peixe : peixesPescados) {
            total += peixe.getPeso() * peixe.getPrecoKg();
        }

        for (Marisco marisco : mariscoPescado) {
            total += marisco.getPeso() * marisco.getPrecoKg();
        }

        return total;

    }
    public double salarioTripulado(){
        return (this.calcularTotal() * 0.6) / this.tripulacao;

    }
    public void exibirDetalhes() {
        System.out.println("\n********** " + this.nome + " | " + this.cor + " | Ano Construção: " + this.anoFabrico + " | " + this.marca + " **********");
        System.out.println("Num. Tripulantes: " + this.tripulacao + " | Carga: " + this.cargaAtual() + "/" + this.capacidadeCarga + " Kg. | " + this.calcularTotal() + " €" + " | Salário Atual Individual: " + this.salarioTripulado() + " €");
        System.out.println("\nCarga de Peixe: ");

        // Listar o peixe
        for (Peixe peixeAtual : this.peixesPescados) {
            peixeAtual.exibirDetalhes();
        }

        System.out.println("\nCarga de Marisco: ");
        // Listar o marisco
        for (Marisco mariscoAtual : this.mariscoPescado) {
            mariscoAtual.exibirDetalhes();
        }

        System.out.println("\n********************************************************************************\n");
    }
}
