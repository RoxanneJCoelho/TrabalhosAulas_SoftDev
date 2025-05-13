package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
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

        // Encontrar o menor elemento

        int menor = array[0]; // inicializar a variável com o 1 elemento para nos ajudar no for
        for (int i = 0; i < array.length; i++) {
            if (menor > array[i]) { // se o menor for maior que o array[i], ele atualiza para o valor do array[i]
                menor = array[i];
            }

        }
        System.out.println("Menor: " + menor);

    }
}
