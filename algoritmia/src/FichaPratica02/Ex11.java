package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double saldo, movimento;

        // Ler saldo
        System.out.print("Insira o seu saldo:");
        saldo = input.nextDouble();

        // Ler valor
        System.out.print("Introduza valor a movimentar:");
        movimento = input.nextDouble();

        // Apresentar o saldo atual
        if (saldo + movimento >= 0) { // Movimento válida

            saldo = saldo + movimento; // Se a transicao for valida, soma ou subtrai, se for negativo, apenas apresenta o saldo inicial
            System.out.println("Transação efetuada");

        } else { // Movimento inválido
            System.out.println("Transação Inválida");
        }
        System.out.println("Saldo Atual: " + saldo); // fica fora do if else pq nós sempre queremos saber o saldo, independente se for positivo ou negativo


    }
}
