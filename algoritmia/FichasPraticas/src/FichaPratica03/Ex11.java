package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int limite, salto, acumulo=0;

        System.out.println("Indique o valor limite: ");
        limite = input.nextInt();

        while (limite<=0){
            System.out.println("Indique o valor limite maior que 0: ");
            limite = input.nextInt();
        }

        System.out.println("Indique o valor do salto: ");
        salto = input.nextInt();

        while (salto<=0){

            System.out.println("Indique o valor do salto maior que 0: ");
            salto = input.nextInt();

        }
        while (acumulo<limite){
            System.out.println(acumulo);
            acumulo = acumulo + salto;
        }

    }
}
