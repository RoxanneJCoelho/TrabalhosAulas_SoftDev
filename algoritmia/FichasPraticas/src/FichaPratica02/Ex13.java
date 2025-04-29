package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int hora, minuto;

        // Ler variaveis
        System.out.println("Introduza horas: ");
        hora = input.nextInt();

        System.out.println("Introduza minutos: ");
        minuto = input.nextInt();

        // Transformar de sistema de 12 horas em sistema de 12 horas

        if (minuto < 60){
            if (hora <= 12) { // Manha
                System.out.println(hora + ":" + minuto + "AM");
            } else if (hora > 13 && hora < 24) { // Tarde
                System.out.println((hora - 12) + ":" + minuto + "PM");
            } else {
                System.out.println("Hora inválida");
            }
        }
        else {
            System.out.println("Minutos inválidos");
        }



    }
}
