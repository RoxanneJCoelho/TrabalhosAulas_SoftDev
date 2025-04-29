package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero_input = 0;
        int tentativa = -1; // pos se a -1 para retirar a tentativa quando for -1
        double somatorio = 1, media; // mete-se somatorio a 1 para cortar o -1


        while (numero_input!=-1) {
            System.out.print("Insira um número: ");
            numero_input = input.nextInt();
            tentativa = tentativa + 1;
            System.out.println(" Tentativa numero: "+ tentativa);
            somatorio =somatorio + numero_input;
        }

        System.out.println("Somatorio: "+ somatorio);

        media=somatorio/tentativa;
        System.out.println("Média: " +  media);
    }
}
