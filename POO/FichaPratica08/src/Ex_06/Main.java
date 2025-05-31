package Ex_06;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Três Porquinhos","Joseph Jacobs","Infantil",30,"123456789");
        Livro livro2 = new Livro("A Origem das Espécies","Charles Darwin","Biologia",550,"11223344");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
