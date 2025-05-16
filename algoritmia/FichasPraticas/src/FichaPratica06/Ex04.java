package FichaPratica06;

import java.util.Scanner;

import;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        int opcao;
        do {
            System.out.println("\n--- Menu de Análise ---");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(Ex03.par(numero) ? "O número é Par." : "O número é Ímpar.");
                    break;
                case 2:
                    System.out.println(Ex03.positivo(numero) ? "O número é Positivo." : "O número é Negativo.");
                    break;
                case 3:
                    System.out.println(Ex03.primo(numero) ? "O número é Primo." : "O número não é Primo.");
                    break;
                case 4:
                    System.out.println(Ex03.perfeito(numero) ? "O número é Perfeito." : "O número não é Perfeito.");
                    break;
                case 5:
                    System.out.println(Ex03.triangular(numero) ? "O número é Triangular." : "O número não é Triangular.");
                    break;
                case 6:
                    System.out.print("Insira um novo número: ");
                    numero = input.nextInt();
                    break;
                case 0:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

    }
}
