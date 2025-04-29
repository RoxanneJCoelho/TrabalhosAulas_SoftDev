package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, inicio = 0;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        while(inicio<=numero){
             System.out.println(inicio);
             inicio = inicio+1;
         }

    }
}
