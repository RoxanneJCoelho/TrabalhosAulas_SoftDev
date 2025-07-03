package Views;

import Controllers.TreinController;
import Models.Competicao;
import Models.Jogador;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TreinView {
    private TreinController treinController;

    public TreinView() throws FileNotFoundException {
        this.treinController = new TreinController();
    }

    public void verCompeticoesAno(ArrayList<Competicao> competicoes, int ano) {
        for (Competicao competicao : competicoes) {
            if (competicao.getAno() == ano) {
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

    public void verCompeticoesAnoMenu() {
        Scanner input = new Scanner(System.in);
        int opcaoVerCompeticoes;

        do {
            System.out.println("Indique o ano que quer ver:");
            System.out.println("1 - 2020");
            System.out.println("2 - 2021");
            System.out.println("3 - 2022");
            System.out.println("4 - 2023");
            System.out.println("0 - Voltar");

            System.out.println("Opção: ");
            opcaoVerCompeticoes = input.nextInt();

            switch (opcaoVerCompeticoes) {
                case 1:
                    this.verCompeticoesAno(treinController.listaCompeticoes(), 2020);
                case 2:
                    this.verCompeticoesAno(treinController.listaCompeticoes(), 2021);
                case 3:
                    this.verCompeticoesAno(treinController.listaCompeticoes(), 2022);
                case 4:
                    this.verCompeticoesAno(treinController.listaCompeticoes(), 2023);
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcaoVerCompeticoes != 0);

    }

    public void rankingDefesaAtaque(ArrayList<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Ranking Defesa: " + jogador.getRankingDefesa());
            System.out.println("Ranking Ataque: " + jogador.getRankingAtaque());
        }
    }

    public void melhorDefesa(ArrayList<Jogador> jogadores) {
        int melhorDefesa = 0;

        for (Jogador jogador : jogadores) {
            if (jogador.getRankingDefesa() > melhorDefesa) {
                melhorDefesa = jogador.getRankingDefesa();
            }
        }

        for (Jogador jogador : jogadores) {
            if (jogador.getRankingDefesa() == melhorDefesa) {
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Ranking Defesa: " + jogador.getRankingDefesa());
            }
        }
    }

    public void melhorAtaque(ArrayList<Jogador> jogadores) {
        int melhorAtaque = 0;

        for (Jogador jogador : jogadores) {
            if (jogador.getRankingAtaque() > melhorAtaque) {
                melhorAtaque = jogador.getRankingAtaque();
            }
        }

        for (Jogador jogador : jogadores) {
            if (jogador.getRankingAtaque() == melhorAtaque) {
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Ranking Ataque: " + jogador.getRankingAtaque());
            }
        }
    }

    public void treinMenu() {
        Scanner input = new Scanner(System.in);
        int opcaoTrein;

        do {
            System.out.println("\n\n ********** MENU TREINADOR *************");
            System.out.println("1 - Consultar todas as competicoes de um determinado ano");
            System.out.println("2 - Consultar o ranking de defesa e o ranking ataque de toda a equipa");
            System.out.println("3 - Consultar qual é o melhor defesa");
            System.out.println("4 - Consultar qual é o melhor atacante");
            System.out.println("0 - Voltar");

            System.out.println("Opção: ");
            opcaoTrein = input.nextInt();

            switch (opcaoTrein) {
                case 1:
                    this.verCompeticoesAnoMenu();
                    break;
                case 2:
                    this.rankingDefesaAtaque(treinController.listaJogadores());
                    break;
                case 3:
                    this.melhorDefesa(treinController.listaJogadores());
                    break;
                case 4:
                    this.melhorAtaque(treinController.listaJogadores());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n Opção inválida!");

            }
        } while (opcaoTrein != 0);
    }
}
