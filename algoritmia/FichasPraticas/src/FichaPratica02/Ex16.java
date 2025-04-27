package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor, nota200, nota100, nota50, nota20, nota10, nota5;

        System.out.print("Insira um valor em euros (múltiplo de 5): ");
        valor = input.nextInt();

        if (valor % 5 != 0) {
            System.out.println("Valor inválido! Tem de ser múltiplo de 5.");
        } else {

            // Calcular número de notas
            if (valor >= 200) {
                nota200 = valor / 200;
                valor = valor % 200;
            } else {
                nota200 = 0;
            }

            if (valor >= 100) {
                nota100 = valor / 100;
                valor = valor % 100;
            } else {
                nota100 = 0;
            }

            if (valor >= 50) {
                nota50 = valor / 50;
                valor = valor % 50;
            } else {
                nota50 = 0;
            }

            if (valor >= 20) {
                nota20 = valor / 20;
                valor = valor % 20;
            } else {
                nota20 = 0;
            }

            if (valor >= 10) {
                nota10 = valor / 10;
                valor = valor % 10;
            } else {
                nota10 = 0;
            }

            if (valor >= 5) {
                nota5 = valor / 5;
                valor = valor % 5;
            } else {
                nota5 = 0;
            }

            // Mostrar o resultado
            System.out.println("Notas necessárias:");
            if (nota200 > 0) {
                System.out.println(nota200 + " nota(s) de 200€");
            }
            if (nota100 > 0) {
                System.out.println(nota100 + " nota(s) de 100€");
            }
            if (nota50 > 0) {
                System.out.println(nota50 + " nota(s) de 50€");
            }
            if (nota20 > 0) {
                System.out.println(nota20 + " nota(s) de 20€");
            }
            if (nota10 > 0) {
                System.out.println(nota10 + " nota(s) de 10€");
            }
            if (nota5 > 0) {
                System.out.println(nota5 + " nota(s) de 5€");
            }
        }

    }
}
