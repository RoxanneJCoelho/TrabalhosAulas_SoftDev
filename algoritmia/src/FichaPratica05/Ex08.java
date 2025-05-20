package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][3];

        // Ler matriz
        for (int i = 0; i < matriz.length; i++) { // ler a linha
            for (int j = 0; j < matriz[0].length; j++) { // ler a coluna
                System.out.print("Indique o número da posição [ " + i + " ] [ " + j + " ]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Apresentar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // o t é para nao ficar tudo muito colado
            } System.out.println();
        }


    }
}
