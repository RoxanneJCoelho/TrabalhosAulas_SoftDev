package FichaPratica01;

// Importar a biblioteca Scanner para ler os inputs do utilizador
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double numero1, numero2, numero3, media;

        // Ler o numero1, que vai ser pedido pelo utilizador
        System.out.print("Introduza o 1º numero:");
        numero1 = input.nextDouble();

        // Ler o numero2, que vai ser pedido pelo utilizador
        System.out.print("Introduza o 2º numero:");
        numero2 = input.nextDouble();

        // Ler o numero3, que vai ser pedido pelo utilizador
        System.out.print("Introduza o 3º numero:");
        numero3 = input.nextDouble();

        // Calcular a media
        media = (numero1+numero2+numero3)/3;

        // Apresentar a media
        System.out.println("Media: " + media);

        // Calcular a media ponderada
        media = ((0.2*numero1)+(0.3*numero2)+(0.5*numero3));

        // Apresentar a media ponderada
        System.out.println("Media ponderada: " + media);

    }
}
