package FichaPratica02;

import java.util.Scanner;

public class Ex10_case {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        double num1, num2, resultado;
        String operacao;

        // Ler as variaveis
        System.out.println("Insira o 1º numero: ");
        num1 = input.nextDouble();

        System.out.println("Insira o 2º numero: ");
        num2 = input.nextDouble();

        System.out.println("Insira a operação que quer fazer:" );
        operacao = input.next();

        // Fazer a calculadora
        switch (operacao) {
            case "+":
                resultado=num1+num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado=num1-num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado=num1*num2;
                System.out.println("Resultado: " + resultado);
                break;
            case"/":
                resultado=num1/num2;
                System.out.println("Resultado: "+ resultado);
                break;
            default:
                System.out.println("Caracter invalido");
                break;
        }

    }
}
