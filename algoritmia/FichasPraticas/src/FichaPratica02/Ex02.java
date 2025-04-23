package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double salario, taxa1, taxa2;

        // Ler variável salario
        System.out.print("Introduza um salário: ");
        salario = input.nextDouble();

        // Calcular taxas
        taxa1=0.2*salario;
        taxa2=0.3*salario;

        // Apresentar taxa
        if (salario<=15000) {
            System.out.print("Paga taxa de 20%: " + taxa1);
        }
        else {
            System.out.print("Paga taxa de 30%: " + taxa2);
        }
    }
}
