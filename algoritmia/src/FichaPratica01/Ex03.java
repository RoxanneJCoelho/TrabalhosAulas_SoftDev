package FichaPratica01;

// Importar a biblioteca Scanner para ler os inputs do utilizador
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double comprimento, largura, area, perimetro;

        // Ler o comprimento, que vai ser pedido pelo utilizador
        System.out.print("Introduza o comprimento do retângulo:");
        comprimento = input.nextDouble();

        // Ler o comprimento, que vai ser pedido pelo utilizador
        System.out.print("Introduza a largura do retângulo:");
        largura = input.nextDouble();

        // Calcular a area
        area = comprimento * largura;

        // Apresentar a area
        System.out.println("Area: " + area);

        // Calcular o perimetro
        perimetro = 2 * comprimento + 2 * largura;

        // Apresentar o perimetro
        System.out.println("Perimetro: " + perimetro);


    }
}
