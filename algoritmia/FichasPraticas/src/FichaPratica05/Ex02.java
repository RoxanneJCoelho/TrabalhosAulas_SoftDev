package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int [] comissoes = new int [12];
        int soma = 0;

        // Ler array
        for(int i = 0; i < comissoes.length; i++){
            System.out.print("Indique a comissão [ "+i+" ]: ");
            comissoes[i] = input.nextInt();
        }

        // Imprimir array
        for(int i = 0; i<comissoes.length; i++){
            System.out.println("Comissão [ "+i+" ]: "+ comissoes[i]);
        }

        // Calcular soma
        for(int i = 0; i<comissoes.length; i++){
            soma = soma+comissoes[i];
        }

        // Apresentar soma
        System.out.println("A Soma das comissões é: "+ soma);

    }
}
