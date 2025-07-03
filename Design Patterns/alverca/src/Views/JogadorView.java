package Views;

import Controllers.JogadorController;
import Models.Competicao;
import Models.Jogador;

import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class JogadorView {
    private JogadorController jogadorController;

    public JogadorView() throws FileNotFoundException {
        this.jogadorController = new JogadorController();
    }

    public void mostrarJogadores(ArrayList<Jogador> jogadores) {
        System.out.println("Número de jogadores: " + jogadores.size());
        for (Jogador jogador : jogadores) {
            System.out.println("Numero: " + jogador.getNumero());
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Idade: " + jogador.getIdade());
            System.out.println("Nacionalidade: " + jogador.getNacionalidade());
            System.out.println("Ranking Defesa: " + jogador.getRankingDefesa());
            System.out.println("Ranking Ataque: " + jogador.getRankingAtaque());
            System.out.println("Valor Compra: " + jogador.getValorCompra());
        }

    }

    public void competicoesAlverca(ArrayList<Competicao> competicoes) {
        for (Competicao competicao : competicoes) {
            if (competicao.getGolosNossos() > competicao.getGolosAdversario()) {
                System.out.println("Dia: " + competicao.getDia());
                System.out.println("Mês: " + competicao.getMes());
                System.out.println("Ano: " + competicao.getAno());
                System.out.println("Competição: " + competicao.getCompeticao());
                System.out.println("Adversário: " + competicao.getAdversario());
                System.out.println("Golos do Alverca: " + competicao.getGolosNossos());
                System.out.println("Golos do Adversário: " + competicao.getGolosAdversario());
            }
        }
    }

    public void competicoesAlvercaMaisGolos(ArrayList<Competicao> competicoes) {
        int maxGolos = 0;

        // Primeiro, encontrar o máximo de golos marcados pelo Alverca
        for (Competicao competicao : competicoes) {
            if (competicao.getGolosNossos() > maxGolos) {
                maxGolos = competicao.getGolosNossos();
            }
        }

        System.out.println("\nCompetições em que o Alverca marcou mais golos (" + maxGolos + " golos):");

        // Depois, listar as competições com esse número de golos
        for (Competicao competicao : competicoes) {
            if (competicao.getGolosNossos() == maxGolos) {
                System.out.println("----------------------------------");
                System.out.println("Dia: " + competicao.getDia());
                System.out.println("Mês: " + competicao.getMes());
                System.out.println("Ano: " + competicao.getAno());
                System.out.println("Competição: " + competicao.getCompeticao());
                System.out.println("Adversário: " + competicao.getAdversario());
                System.out.println("Golos do Alverca: " + competicao.getGolosNossos());
                System.out.println("Golos do Adversário: " + competicao.getGolosAdversario());
            }
        }
    }

    public void jogadorMenu() {
        Scanner input = new Scanner(System.in);
        int opcaoJogador;

        do {
            System.out.println("\n\n *********** MENU JOGADOR *************");
            System.out.println("1 - Consultar todos os jogadores");
            System.out.println("2 - Consultar todas as competições que o Alverca ganhou");
            System.out.println("3 - Consultar as competições que o Alverca marcou mais golos");
            System.out.println("0 - Voltar");

            System.out.println("Opção: ");
            opcaoJogador = input.nextInt();

            switch (opcaoJogador) {
                case 1:
                    this.mostrarJogadores(jogadorController.listaJogadores());
                    break;
                case 2:
                    this.competicoesAlverca(jogadorController.listaCompeticoes());
                    break;
                case 3:
                    this.competicoesAlvercaMaisGolos(jogadorController.listaCompeticoes());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida!");


            }
        } while (opcaoJogador != 0);
    }

}
