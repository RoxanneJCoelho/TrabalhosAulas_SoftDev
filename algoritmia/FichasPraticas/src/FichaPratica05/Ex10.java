package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[3][5];
        int pesquisa;
        int soma = 0;

        // Ler matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Indique o número da posição [ " + i + " ] [ " + j + " ]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        // Pesquisa
        System.out.print("Insira um número para pesquisar:" );
        pesquisa = input.nextInt();

        // Calcular pesquisa
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (pesquisa == matriz[i][j]){
                    soma++;
                }
            }
        }

        // Apresentar soma
        System.out.println("Há "+soma+" posições na matriz com o número "+ pesquisa);

    }
}
