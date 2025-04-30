package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, num_fat, resultado = 1; // é preciso inicializar resultado e vamos por 1 pq é o elemento neutro da multiplicacao;

        System.out.println("Insira um numero não negativo menor que 13: ");
        numero = input.nextInt();

        while (numero<=0 || numero>=13) {
            System.out.println("Insira um numero não negativo menor que 13: ");
            numero = input.nextInt();
        }

        num_fat = numero; // só aqui é que podemos inicializar num-fat pq ja temos o dado do numero

        while (num_fat>1){
            resultado *= num_fat ;
            num_fat-=1;
        }
        System.out.println(" fatorial: "+ resultado);

    }
}
