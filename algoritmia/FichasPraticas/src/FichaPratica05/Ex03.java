package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar array
        int[] array = new int[10];

        // Ler array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Indique o número [ " + i + " ]: ");
            array[i] = input.nextInt();
        }

        // Encontrar o maior elemento

        int maior = array[0]; // inicializar a variável com o 1 elemento para nos ajudar no for
        for (int i = 0; i < array.length; i++) {
            if (maior < array[i]) { // se o maior for menor que o array[i], ele atualiza para o valor do array[i]
                maior = array[i];
            }

        }
        System.out.println("Maior: " + maior);

    }

}
