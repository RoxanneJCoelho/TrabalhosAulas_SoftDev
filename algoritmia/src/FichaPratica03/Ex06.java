package FichaPratica03;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero_inicio, numero_fim;

        System.out.print("Insira um numero de inicio: ");
        numero_inicio = input.nextInt();

        System.out.print("Insira um numero de fim: ");
        numero_fim = input.nextInt();

        while (numero_inicio<=numero_fim){
            System.out.println(numero_inicio);
            numero_inicio = numero_inicio + 1;
        }

    }
}
