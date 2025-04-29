package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, inicio = 0;
        String frase;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        System.out.print("Introduz uma frase: ");
        input.nextLine(); // se fosse o primeiro input nao seria necessario a limpeza do buffer
        frase = input.nextLine();

        while (inicio<numero){
            System.out.println(frase);
            inicio = inicio + 1;
        }


    }
}
