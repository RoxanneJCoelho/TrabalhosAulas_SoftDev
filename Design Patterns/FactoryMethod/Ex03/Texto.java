package Ex03;

public class Texto extends Document {
    public Texto(String nome, String autor) {
        super(nome, autor);
        this.extensao = "docx";
    }

    public void open() {
        System.out.println("A abrir documento de texto " + this.nome + "." + this.extensao);
    }

    public void close() {
        System.out.println("A fechar o documento de texto");
    }
}
