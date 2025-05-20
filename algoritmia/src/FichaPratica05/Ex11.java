package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];
        int maior = matriz[0][0];
        int menor = matriz [0][0];

        // Ler matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Indique o número da posição [ " + i + " ] [ " + j + " ]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                // Percebemos se o elemento atual é maior
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }

                // Percebemos se o elemento atual é menor
                if (matriz[linha][coluna] < menor) {
                    menor = matriz[linha][coluna];
                }

            }
        }

        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);


        System.out.println("_____________________________________");

        // Imprimir a matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]+"\t");
            }
            System.out.println();
        }
    }
}
