package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int menu;

        // Ler a variavel
        System.out.println("Opções do menu (escolha um numero de 1 a 4): ");
        menu = input.nextInt();

        // Criar o menu
        switch (menu) {
            case 1:
                System.out.println("Criar");
                break;
            case 2:
                System.out.println("Atualizar");
                break;
            case 3:
                System.out.println("Eliminar");
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

}

