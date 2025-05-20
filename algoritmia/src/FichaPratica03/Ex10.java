package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inicio = 2, numero_input;

        System.out.println("Insira um numero: ");
        numero_input=input.nextInt();

        while (numero_input<=2){
            System.out.println("Por favor , insira um numero maior que 2: ");
            numero_input=input.nextInt();
        }
        while (inicio<=numero_input){
            System.out.println(inicio);
            inicio = inicio + 2;
        }



    }
}
