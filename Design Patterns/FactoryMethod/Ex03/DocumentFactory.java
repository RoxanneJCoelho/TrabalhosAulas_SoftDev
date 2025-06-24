package Ex03;

public class DocumentFactory {
    public Document criarDocumento(String tipo, String nome, String autor) {
        if (tipo.equalsIgnoreCase("texto")) {
            return new Texto(nome, autor);
        } else if (tipo.equalsIgnoreCase("folha")) {
            return new FolhaCalculo(nome, autor);
        } else if (tipo.equalsIgnoreCase("apresentacao")) {
            return new Apresentacao(nome, autor);
        } else {
            System.out.println("Tipo de documento desconhecido!");
            return null;
        }
    }
}
