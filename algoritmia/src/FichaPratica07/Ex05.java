package FichaPratica07;

import java.io.*;
import java.util.Scanner;

public class Ex05 {

    // Função que calcula a soma dos números inteiros num ficheiro
    public static int calcularSoma(String caminho) throws IOException {
        int soma = 0;

        try (Scanner scanner = new Scanner(new File(caminho))) {
            // Lê palavra a palavra (número a número)
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    soma += scanner.nextInt();
                } else {
                    scanner.next(); // Ignora caso não seja um número
                }
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        String nomeFicheiro = "numeros.txt"; // Nome do ficheiro

        try {
            int soma = calcularSoma(nomeFicheiro);
            System.out.println("Soma dos números: " + soma);
        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}


