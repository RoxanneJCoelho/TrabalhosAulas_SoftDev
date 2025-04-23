package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
         int num1, num2, num3;

         // ler os numeros

        System.out.println("Insira o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Insira o segundo número: ");
        num2 = input.nextInt();

        System.out.println("Insira o terceiro número: ");
        num3 = input.nextInt();

        // Dizer qual é o menor numero lido:
        if (num1<num2 && num1<num3){
            System.out.println("O menor numero é: " + num1 );
        } else if (num2<num1 && num2<num3){
            System.out.println("O menor numero é: " + num2);
        } else {
            System.out.println(" O menor numero é: " + num3);
        }
    }
}
