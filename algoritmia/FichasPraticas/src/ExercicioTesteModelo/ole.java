package FichaPratica04;

import java.util.Scanner;

public class ole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        do{
            do{
                System.out.println("1 - Opcao Um");
                System.out.println("2 - Opcao Dois");
                System.out.println("3 - Opcao Tres");
                System.out.println("4 - Opcao Quatro");

                System.out.print("Escolha uma das opções: ");
                opcao = input.nextInt();


            } while (opcao<1 || opcao>4); // repetir o menu enquanto a opcao nao for 1,2,3,4, se for, entra no switch
            switch(opcao){
                case 1:
                    System.out.println("Escolheu opcao um");
                    break;
                case 2:
                    System.out.println("Escolheu opcao dois");
                    break;
                case 3:
                    System.out.println("Escolheu opcao tres");
                    break;
                case 4:
                    System.out.println("Sair");
                    break;

            }
        } while (opcao!=4);
    }
}
