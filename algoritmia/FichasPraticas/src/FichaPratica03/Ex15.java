package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fatorial, total = 0;

        System.out.println("Insira um numero não negativo menor que 13: ");
        fatorial = input.nextInt();

        while (fatorial<0 && fatorial<13) {
            System.out.println("Insira um numero não negativo menor que 13: ");
            fatorial = input.nextInt();
        }
        while (fatorial>=1){
            total = fatorial * (fatorial-1);
            fatorial-=1;
        }
        System.out.println("Fatorial: " + total);
    }
}
