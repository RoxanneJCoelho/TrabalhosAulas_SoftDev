package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Import do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int numero;
        boolean primo = true;

        // Ler num
        System.out.print("Introduza um número: ");
        numero = input.nextInt();

        // numeros abaixo de 1 n podem ser primos
        if (numero <= 1) {
            primo = false;
        }

        // todos os numeros sao divisiveis por 1, entao comecamos o divisor em 2
        // o numero primo apenas é divisivel por 1 e ele proprio, entao se houver algum divisor entre 1 e o numero deixa de ser primo
        // divisor é sempre mais baixo que o numero, dai o divisor<numero,
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                primo = false;
            }
        }

        // diz se é primo ou não
        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não primo");
        }




    }
}
