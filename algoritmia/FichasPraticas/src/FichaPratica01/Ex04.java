package FichaPratica01;

// Importar a biblioteca Scanner para ler os inputs do utilizador
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double raio, area, perimetro;

        // Ler a area, que vai ser pedido pelo utilizador
        System.out.print("Introduza o raio do círculo:");
        raio = input.nextDouble();

        // Calcular o perimetro
        perimetro = 2 * raio * 3.14;

        // Apresentar a area
        System.out.println("Perimetro: " + perimetro);

        // Calcular a area
        area = Math.pow(raio, 2 ) * 3.14;

        // Apresentar a area
        System.out.println("Area: " + area);


    }
}
