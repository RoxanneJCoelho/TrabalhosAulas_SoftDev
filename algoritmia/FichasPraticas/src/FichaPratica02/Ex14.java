package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2, num3;

        // Ler variaveis
        System.out.println("Insira um numero: ");
        num1 = input.nextInt();

        System.out.println("Insira outro numero: ");
        num2 = input.nextInt();

        System.out.println("Insira outro numero: ");
        num3 = input.nextInt();

        // Ordenar manualmente
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Ordem crescente: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Ordem crescente: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Ordem crescente: " + num2 + ", " + num3 + ", " + num1);
            }
        } else { // num3 é o menor
            if (num1 <= num2) {
                System.out.println("Ordem crescente: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Ordem crescente: " + num3 + ", " + num2 + ", " + num1);
            }
        }


    }
}
