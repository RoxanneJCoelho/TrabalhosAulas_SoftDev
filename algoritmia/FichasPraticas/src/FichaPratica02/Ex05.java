package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double num1, num2;

        // Ler os numeros
        System.out.print("Introduza um número: ");
        num1 = input.nextDouble();

        System.out.print("Introduza um número: ");
        num2 = input.nextDouble();

        // Apresentar o menor depois o maior
        if (num1 > num2) {
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println(num1 + " " + num2);
        }
    }
}
