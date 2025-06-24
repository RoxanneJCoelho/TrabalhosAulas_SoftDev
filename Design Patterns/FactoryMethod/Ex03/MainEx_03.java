package Ex03;

import java.util.Scanner;

public class MainEx_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentFactory factory = new DocumentFactory();

        System.out.print("Tipo de documento (texto, folha, apresentacao): ");
        String tipo = scanner.nextLine();

        System.out.print("Nome do documento: ");
        String nome = scanner.nextLine();

        System.out.print("Autor do documento: ");
        String autor = scanner.nextLine();

        Document doc = factory.criarDocumento(tipo, nome, autor);

        if (doc != null) {
            System.out.print("O que desejas fazer? (open, save, close): ");
            String acao = scanner.nextLine();

            switch (acao.toLowerCase()) {
                case "open":
                    doc.open();
                    break;
                case "save":
                    doc.save();
                    break;
                case "close":
                    doc.close();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
