package FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[5][5];
        double soma = 0;

        // Ler matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Indique o número da posição [ " + i + " ] [ " + j + " ]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Calcular soma
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma = soma + matriz[i][j];
            }
        }

        // Apresentar soma
        System.out.println("Soma: " + soma);
    }
}
