package Ex03;

public class Apresentacao extends Document {
    public Apresentacao(String nome, String autor) {
        super(nome, autor);
        this.extensao = "pptx";
    }

    public void open() {
        System.out.println("A abrir documento de apresentação " + this.nome + "." + this.extensao);
    }

    public void close() {
        System.out.println("A fechar o documento de apresentação");
    }
}