package Ex03;

public class FolhaCalculo extends Document {
    public FolhaCalculo(String nome, String autor) {
        super(nome, autor);
        this.extensao = "xlsx";
    }

    public void open() {
        System.out.println("A abrir documento de folha de cálculo " + this.nome + "." + this.extensao);
    }

    public void close() {
        System.out.println("A fechar o documento de folha de cálculo");
    }
}
