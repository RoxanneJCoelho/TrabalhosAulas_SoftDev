package Views;

import Controllers.AdminController;
import Models.Jogador;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminView {
    private AdminController adminController;

    public AdminView() throws FileNotFoundException{
        this.adminController = new AdminController();
    }

    public void jogadorBarato(ArrayList<Jogador> jogadores){

        int barato = 50000;
        for (Jogador jogador : jogadores){
            if(jogador.getValorCompra()<barato){
                barato = jogador.getValorCompra();
            }
        }

        for (Jogador jogador : jogadores){
            if(jogador.getValorCompra()==barato){
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Valor de Compra: " + jogador.getValorCompra());
            }
        }

    }

    public void jogadorCaro(ArrayList<Jogador> jogadores){

        int caro = 0;
        for (Jogador jogador : jogadores){
            if(jogador.getValorCompra()>caro){
                caro = jogador.getValorCompra();
            }
        }

        for (Jogador jogador : jogadores){
            if(jogador.getValorCompra()==caro){
                System.out.println("Nome: " + jogador.getNome());
                System.out.println("Valor de Compra: " + jogador.getValorCompra());
            }
        }

    }

    public void adminMenu(){
        Scanner input = new Scanner(System.in);
        int opcaoAdmin;

        do{
            System.out.println("\n\n *************+ MENU ADMIN ***************");
            System.out.println("1 - Consultar o valor total da equipa");
            System.out.println("2 - Consultar o jogador mais barato");
            System.out.println("3 - Consultar o jogador mais caro");
            System.out.println("0 - Voltar");

            System.out.println("Opção: ");
            opcaoAdmin = input.nextInt();

            switch (opcaoAdmin){
                case 1:
                    System.out.println("__________ Valor total da equipa___________");
                    System.out.println(this.adminController.valorTotalEquipa() + " euros.");
                    break;
                case 2:
                    this.jogadorBarato(this.adminController.listaJogadores());
                    break;
                case 3:
                    this.jogadorCaro(this.adminController.listaJogadores());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opcaoAdmin!=0);
    }
}
