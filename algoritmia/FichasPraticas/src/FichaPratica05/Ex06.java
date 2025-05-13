package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] array = new int[10];
        boolean crescente = true;

        // Ler array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Indique o número [ " + i + " ]: ");
            array[i] = input.nextInt();
        }

        // Ver se ta em crescente

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                crescente = false;
            }
        }
        if (crescente){
            System.out.println("Sequencia crescente");
        } else {
            System.out.println("Sequencia nao crescente");
        }

    }
}
