package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex05.*;

public class Ex06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir o tamanho do vetor
        System.out.print("Insira o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        // Preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o elemento [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int opcao;
        do {
            // Menu
            System.out.println("\n***** Programa de Análise de um Vetor *****");
            System.out.println("7. Maior Elemento");
            System.out.println("8. Menor Elemento");
            System.out.println("9. Crescente ou Não Crescente");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 7:
                    System.out.println("Maior elemento: " + maior(vetor));
                    break;

                case 8:
                    System.out.println("Menor elemento: " + menor(vetor));
                    break;

                case 9:
                    if (crescente(vetor)) {
                        System.out.println("O vetor está em ordem crescente.");
                    } else {
                        System.out.println("O vetor não está em ordem crescente.");
                    }
                    break;

                case 0:
                    System.out.println("A sair do programa...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }

        } while (opcao != 0);


    }
}
