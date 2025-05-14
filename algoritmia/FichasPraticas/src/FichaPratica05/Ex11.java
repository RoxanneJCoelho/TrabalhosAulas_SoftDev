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
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Indique o número da posição [ " + i + " ] [ " + j + " ]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Pesquisar maior
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (maior < matriz[i][j]) {
                        maior = matriz[i][j];
                }
            }
        }

        // Pesquisar menor
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (menor > matriz[i][j]) {
                    menor = matriz[i][j];
                }
            }
        }

        // Apresentar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            } System.out.println();
        }
    }
}
