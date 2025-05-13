package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar array
        int[] array = new int[10];

        // Ler array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira no vetor [" + i + "]: ");
            array[i] = input.nextInt();
        }

        // Separar o ler do imprimir
        System.out.println("********************");

        // Imprimir vetor
        for (int i = 0; i < array.length; i++) {
            System.out.println("Vetor [" + i + "]: " + array[i]);
        }

    }
}
