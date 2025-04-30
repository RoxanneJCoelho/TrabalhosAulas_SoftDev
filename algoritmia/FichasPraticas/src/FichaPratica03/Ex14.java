package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total, count = 1, anterior, atual; // count é igual a 1 pq um introduza numero é fora do loop
        boolean crescente = true;

        System.out.print("Quantos números deseja inserir?: ");
        total = input.nextInt();

        System.out.print("Introduza um número: ");
        anterior = input.nextInt();

        while (total>count){
            System.out.print("Introduza um número: ");
            atual = input.nextInt();
            total-=1;

            if (atual<=anterior){
                crescente = false;
            }
            anterior=atual;

        }
        if (crescente){
            System.out.println("crescente");
        } else {
            System.out.println("nao crescente");
        }

    }
}
