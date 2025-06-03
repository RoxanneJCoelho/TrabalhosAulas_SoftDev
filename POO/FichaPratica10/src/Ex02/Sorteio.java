package Ex02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private String nome;
    private double premio;
    private ArrayList<Pessoa> listaParticipantes;

    public Sorteio(String nome, double premio) {
        this.nome = nome;
        this.premio = premio;
        this.listaParticipantes = new ArrayList<Pessoa>();
    }

    public void inscreverParticipante(Pessoa participante) {
        if (participante.getIdade()>=18) {
            this.listaParticipantes.add(participante);
            System.out.println("Participante inscrito com sucesso: " + participante.getNome());
        } else {
            System.out.println("Inscrição recusada: " + participante.getNome() + ". Menores de 18 anos não podem participar");
        }
    }

    public Pessoa sortearVencedor (){
        Random rd = new Random();
        int indexVencedor = rd.nextInt(this.listaParticipantes.size());
        return this.listaParticipantes.get(indexVencedor);

    }

    public void listarParticipantes() {
        System.out.println("\n*_*_*_*_*_*_*_*_*_* " + this.nome + " | " + this.premio + " € *_*_*_*_*_*_*_*_*_*");

        int contadorPessoas = 1;

        for (Pessoa pessoaAtual : this.listaParticipantes) {
            System.out.print("Inscrito Nº" + contadorPessoas++ + ": ");
            pessoaAtual.exibirDetalhes();
        }
    }


}

