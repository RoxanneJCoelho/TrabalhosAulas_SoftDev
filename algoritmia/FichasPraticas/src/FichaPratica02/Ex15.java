package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        String opcao;

        System.out.println("Insira um numero: ");
        num1 = input.nextInt();

        System.out.println("Insira outro numero: ");
        num2 = input.nextInt();

        System.out.println("Insira outro numero: ");
        num3 = input.nextInt();

        System.out.println("Quer ordem crescente (C) ou decrescente (D)?");
        opcao = input.next();

        if (opcao.equals("C")) { // CRESCENTE
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
        } else if (opcao.equals("D")) { // DECRESCENTE
            if (num1 >= num2 && num1 >= num3) {
                if (num2 >= num3) {
                    System.out.println("Ordem decrescente: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("Ordem decrescente: " + num1 + ", " + num3 + ", " + num2);
                }
            } else if (num2 >= num1 && num2 >= num3) {
                if (num1 >= num3) {
                    System.out.println("Ordem decrescente: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("Ordem decrescente: " + num2 + ", " + num3 + ", " + num1);
                }
            } else { // num3 é o maior
                if (num1 >= num2) {
                    System.out.println("Ordem decrescente: " + num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.println("Ordem decrescente: " + num3 + ", " + num2 + ", " + num1);
                }
            }
        } else {
            System.out.println("Opção inválida! Tem de escrever C ou D.");
        }

    }
}
