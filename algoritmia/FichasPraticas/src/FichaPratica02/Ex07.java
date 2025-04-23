package FichaPratica02;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num;

        // Ler o numero
        System.out.print("Insira um numero: ");
        num = input.nextInt();

        // Vê se o número é par ou impar

        if (num%2==0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

    }
}
