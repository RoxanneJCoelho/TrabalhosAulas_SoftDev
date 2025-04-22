package FichaPratica01;

// Importar a biblioteca Scanner para ler os inputs do utilizador
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        //  Ler variaveis
        int minuto1, segundo1, minuto2, segundo2, minuto3, segundo3, minuto4, segundo4, minuto5, segundo5, totalSegundos1, totalSegundos2, totalSegundos3, totalSegundos4, totalSegundos5, totalSegundosTotal, horasTotal, restoTotal, minutosTotal, segundosTotal ;

        // Cancao 1
        System.out.print("Introduza minutos da musica 1:");
        minuto1 = input.nextInt();
        System.out.print("Introduza segundos da musica 1:");
        segundo1 = input.nextInt();
        totalSegundos1 = minuto1 * 60 + segundo1;

        // Cancao 2
        System.out.print("Introduza minutos da musica 2:");
        minuto2 = input.nextInt();
        System.out.print("Introduza segundos da musica 2:");
        segundo2 = input.nextInt();
        totalSegundos2 = minuto2 * 60 + segundo2;

        // Cancao 3
        System.out.print("Introduza minutos da musica 3:");
        minuto3 = input.nextInt();
        System.out.print("Introduza segundos da musica 3:");
        segundo3 = input.nextInt();
        totalSegundos3 = minuto3 * 60 + segundo3;

        // Cancao 4
        System.out.print("Introduza minutos da musica 4:");
        minuto4 = input.nextInt();
        System.out.print("Introduza segundos da musica 4:");
        segundo4 = input.nextInt();
        totalSegundos4 = minuto4 * 60 + segundo4;

        // Cancao 5
        System.out.print("Introduza minutos da musica 5:");
        minuto5 = input.nextInt();
        System.out.print("Introduza segundos da musica 5:");
        segundo5 = input.nextInt();
        totalSegundos5 = minuto5 * 60 + segundo5;

        // Total segundos
        totalSegundosTotal = totalSegundos1 + totalSegundos2 + totalSegundos3 + totalSegundos4 + totalSegundos5;
        horasTotal = totalSegundosTotal / 3600;
        restoTotal = totalSegundosTotal % 3600;
        minutosTotal = restoTotal / 60;
        segundosTotal = restoTotal % 60;

        // Apresentar a duração do album
        System.out.println("Duração total do album: " + horasTotal + "hrs, "+ minutosTotal + "min, " + segundosTotal + "seg");
    }

}
