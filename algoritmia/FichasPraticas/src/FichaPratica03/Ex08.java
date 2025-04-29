package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero_input;

        System.out.print("Insira um número: ");
        numero_input = input.nextInt();

        int numero_abaixo = numero_input-5, numero_acima=numero_input+5;

        while (numero_abaixo<numero_input){
            System.out.println(numero_abaixo);
            numero_abaixo = numero_abaixo + 1;
        }

        System.out.println(" "); // para dar um espaço

        while (numero_acima>numero_input){
            numero_input = numero_input + 1; // primeiro soma para nao aparecer o numero_input
            System.out.println(numero_input);
        }


    }
}
