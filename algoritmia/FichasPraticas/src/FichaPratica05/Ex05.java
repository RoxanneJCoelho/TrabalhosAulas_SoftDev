package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] array = new int[10];
        double soma = 0;
        double media;

        // Ler array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Indique o número [ " + i + " ]: ");
            array[i] = input.nextInt();
        }
        // Calcular soma
        for (int i = 0; i<array.length; i++){
            soma = soma+array[i];
        }
        // Calcular média
        media = soma / array.length;

        // Apresentar média
        System.out.println("Média: " + media);

    }
}
