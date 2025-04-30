package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, tentativa1 = 0, tentativa2 = 0, tentativa3 = 0, tentativa4 = 0;

        System.out.print("Introduza um numero: ");
        numero = input.nextInt();

        while (numero >= 0) {
            System.out.print("Introduza um numero: ");
            numero = input.nextInt();
            if (numero >= 0 && numero <= 25) {
                tentativa1 += 1;
            } else if (numero >= 26 && numero <= 50) {
                tentativa2 += 1;
            } else if (numero >= 51 && numero <= 75) {
                tentativa3 += 1;
            } else if (numero >= 76 && numero <= 100) {
                tentativa4 += 1;
            }
        }

        System.out.println("[00,25]: " + tentativa1);
        System.out.println("[26,50]: " + tentativa2);
        System.out.println("[51,75]: " + tentativa3);
        System.out.println("[76,100]: " + tentativa4);
    }
}
