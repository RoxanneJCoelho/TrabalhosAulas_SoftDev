package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, taxa1, taxa2, taxa3, taxa4;

        // Ler o salário
        System.out.print("Introduza o seu salário: ");
        salario = input.nextDouble();

        // Calcular as taxas
        taxa1 = 0.2 * salario;
        taxa2 = 0.3 * salario;
        taxa3 = 0.35 * salario;
        taxa4 = 0.4 * salario;

        // Apresentar as taxas
        if (salario <= 15000) {
            System.out.println("Paga taxa de 20%: " + taxa1);
        } else if (salario > 15000 && salario <= 20000) {
            System.out.println("Paga taxa de 30%: " + taxa2);
        } else if (salario > 20000 && salario <= 25000) {
            System.out.println("Paga taxa de 35%: " + taxa3);
        } else {
            System.out.println("Paga taxa de 40%: " + taxa4);
        }
    }
}

