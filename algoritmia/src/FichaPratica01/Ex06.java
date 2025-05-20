package FichaPratica01;

// Importar a biblioteca Scanner para ler os inputs do utilizador
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        // Criação do Scanner - Vamos ler inputs do utilizador
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double valor1, valor2, variavel;

        // Ler o valor1, que vai ser pedido pelo utilizador
        System.out.print("Introduza o 1º valor:");
        valor1 = input.nextDouble();

        // Ler o valor2, que vai ser pedido pelo utilizador
        System.out.print("Introduza o 2º valor:");
        valor2 = input.nextDouble();

        // A variavel vai guardar o valor1
        variavel=valor1;

        // O valor 1 vai ficar com o valor2
        valor1=valor2;

        // o Valor 2 fica com o valor da variável
        valor2=variavel;

        // Ler o valor1
        System.out.println("1º valor: "+ valor1);

        // Ler o valor2
        System.out.print("2º valor: "+ valor2);




    }
}
