package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int num1, num2;

        // Ler numeros

        System.out.println("Insira o numero: ");
        num1= input.nextInt();

        System.out.println("Insira outro numero: ");
        num2= input.nextInt();

        // Imprimir o maior numero
         if (num1>num2) {
             System.out.println("maior: " + num1);
         }
         else {
             System.out.println("maior: " + num2);
         }
    }
}
