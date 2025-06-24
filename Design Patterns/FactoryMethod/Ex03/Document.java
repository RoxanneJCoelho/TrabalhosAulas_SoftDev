package Ex03;

public abstract class Document {
    protected String nome;
    protected String autor;
    protected String extensao;

    public Document(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    public abstract void open();
    public void save() {
        System.out.println("Alterações de " + this.autor + " gravadas");
    }
    public abstract void close();
}

