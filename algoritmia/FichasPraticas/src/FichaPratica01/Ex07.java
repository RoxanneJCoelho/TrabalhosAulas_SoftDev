package FichaPratica01;

// Importar a biblioteca Scanner para ler os inputs do utilizador
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valor1, valor2, valor3, valortotal;

        // Ler o valor1, que vai ser pedido pelo utilizador
        System.out.print("Introduza o 1º valor:");
        valor1 = input.nextDouble();

        // Ler o valor2, que vai ser pedido pelo utilizador
        System.out.print("Introduza o 2º valor:");
        valor2 = input.nextDouble();

        // Ler o valor3, que vai ser pedido pelo utilizador
        System.out.print("Introduza o 3º valor:");
        valor3 = input.nextDouble();

        // Calcular o valortotal (com o desconto de 10% é 90% do valor total)
        valortotal = 0.9*(valor1+valor2+valor3);

        // Apresentar valor total
        System.out.print("Valor total:" + valortotal);

    }
}
