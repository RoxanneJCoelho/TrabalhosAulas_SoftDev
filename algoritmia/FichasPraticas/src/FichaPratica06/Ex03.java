package FichaPratica06;

import java.util.Scanner;

public class Ex03 {

    // Função que verifica se um número é par

    static boolean par(int num) {
        return num % 2 == 0;
    }
    // Função que verifica se um número é positivo ou negativo

    static boolean positivo(int num) {
        return num >= 0;
    }

    // Função que verifica se um número é primo
    static boolean primo(int num) {

        if (num <= 1) {
            return false; // 0 e 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // se for divisível por algum número entre 2 e √num, não é primo
            }
        }
        return true; // se não encontrou nenhum divisor, é primo

    }

    // Função que verifica se um número é perfeito
    static boolean perfeito(int num) {
        if (num <= 0) {
            return false;
        }

        int soma = 0;
        // Verifica todos os divisores próprios (exclui o próprio número)
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        return soma == num;
    }

    // Função que verifica se um número é triangular
    static boolean triangular (int num) {
        if (num <= 0) {
            return false;
        }
        int soma = 0;
        int i = 1;

        // Soma inteiros consecutivos até ultrapassar ou igualar o número
        while (soma < num) {
            soma += i;
            i++;
        }

        return soma == num;

    }
}



