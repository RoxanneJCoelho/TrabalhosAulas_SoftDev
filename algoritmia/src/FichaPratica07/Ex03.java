package FichaPratica07;

import java.io.*;

public class Ex03 {
    public static void main(String[] args) {
        String ficheiroOrigem = "Ficheiros/FichaPratica07/exercicio_03.txt";
        String ficheiroDestino  = "Ficheiros/FichaPratica07/novo_ficheiro03.txt";

        // Usar try-with-resources para garantir o fecho automático dos ficheiros
        try (
                BufferedReader leitor = new BufferedReader(new FileReader(ficheiroOrigem));
                BufferedWriter escritor = new BufferedWriter(new FileWriter(ficheiroDestino))
        ) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                escritor.write(linha);
                escritor.newLine(); // Para manter a formatação original
            }
            System.out.println("Conteúdo copiado com sucesso de " + ficheiroOrigem + " para " + ficheiroDestino);
        } catch (IOException e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
