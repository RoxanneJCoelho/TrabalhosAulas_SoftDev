package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] array = new int[10];

        // Ler array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Indique o número [ " + i + " ]: ");
            array[i] = input.nextInt();
        }

        // Encontrar o maior valor par
        int maiorPar = 0;
        boolean encontrouPar = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (!encontrouPar || array[i] > maiorPar) { // se não encontrou um par, ele é o primeiro; se houver um numero maior que o maiorPar, ele atualiza
                    maiorPar = array[i];
                    encontrouPar = true;
                }
            }
        }

        // Apresentar o maior valor par

        if (encontrouPar) {
            System.out.println("Maior número par: " + maiorPar);
        } else {
            System.out.println("Não foi inserido nenhum número par.");
        }

    }
}
