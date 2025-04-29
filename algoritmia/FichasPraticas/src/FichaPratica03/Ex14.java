package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tentativa, numero;

        System.out.print("Quantos números deseja inserir?: ");
        tentativa = input.nextInt();

        while (tentativa>0) {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
            tentativa -= 1;
            numero = 0;
        }

    }
}
