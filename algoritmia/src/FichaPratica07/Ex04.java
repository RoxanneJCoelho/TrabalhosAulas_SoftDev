package FichaPratica07;

import java.io.*;

public class Ex04 {
    public static void main(String[] args) {
        String nomeFicheiro = "dados.csv"; // Nome do ficheiro CSV

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeFicheiro))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                // Divide a linha pelos separadores (vírgulas)
                String[] campos = linha.split(",");

                // Imprime os campos separados
                for (String campo : campos) {
                    System.out.print(campo.trim() + " | ");
                }
                System.out.println(); // Nova linha após cada registo
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
