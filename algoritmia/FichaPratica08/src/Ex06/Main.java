package Ex06;

public class Main {
    public static void main(String[] args) {
        Livro chic = new Livro ("A Origem das Espécies", "Charles Darwin", "Biologia", 550, "9789726656296");
        Livro vintage = new Livro ("A República", "Platão", "Filosofia", 980, "9789723105094");

        chic.exibirDetalhes();
        vintage.exibirDetalhes();
    }


}
