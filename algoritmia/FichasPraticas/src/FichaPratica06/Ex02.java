package FichaPratica06;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        // Solicitar número até que seja inteiro positivo
        do {
            System.out.print("Introduza um número inteiro positivo: ");
            while (!input.hasNextInt()) {
                System.out.print("Valor inválido. Introduza um número inteiro positivo: ");
                input.next(); // descarta a entrada inválida
            }
            numero = input.nextInt();
            if (numero <= 0) {
                System.out.println("O número deve ser positivo.");
            }
        } while (numero <= 0);

        // Chamar a função que imprime os asteriscos
        imprimirAsteriscos(numero);
    }

    // Função que imprime asteriscos numa linha
    public static void imprimirAsteriscos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // para mudar de linha no final
    }
}
