package FichaPratica01;

// Importar a biblioteca Scanner para ler os inputs do utilizador
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero1, numero2, soma, subtracao, multi, divisao;

        // Ler numero 1
        System.out.print("Introduz um número:");
        numero1 = input.nextInt();

        // Ler numero 2
        System.out.print("Introduz um número:");
        numero2 = input.nextInt();

        // Calcular a soma
        soma=numero1+numero2;

        //Apresentar a soma
        System.out.println("Soma:"+soma);

        // Calcular a subtracao
        subtracao=numero1-numero2;

        //Apresentar a subtracao
        System.out.println("Subtração:"+subtracao);

        // Calcular a multiplicacao
        multi=numero1*numero2;

        //Apresentar a multiplicacao
        System.out.println("Multiplicacao:"+multi);

        // Calcular a divisao
        divisao=numero1/numero2;

        //Apresentar a divisao
        System.out.println("Divisão:"+divisao);
    }
}
