package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[5];

        // Ler vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int maiorElemento = -1; // pode ser qualquer número impar

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) { // se o numero for par, entra neste if

                if (maiorElemento % 2 != 0) {
                    maiorElemento = vetor[i]; // se o primeiro numero for par, substitui o impar do maior elemento
                }

                if (vetor[i] > maiorElemento) { // se houver um par maior, substitui pelo par maior
                    maiorElemento = vetor[i];
                }

            }
        }

        if (maiorElemento % 2 == 0) {
            System.out.println("Maior Par: " + maiorElemento);
        } else {
            System.out.println("Não há pares");
        }


    }
}