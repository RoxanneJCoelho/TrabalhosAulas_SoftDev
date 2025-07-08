package parteB.gestaoBiblioteca;

public class Main {
    public static void main(String[] args) {
        Livro headsFirstJava = new Livro("Heads First Java", "Kathy Sierra", 2015, 760);
        Livro hobbit = new Livro("Hobbit", "Tolkien", 2000, 600);

         Biblioteca aMinhaBiblioteca = new Biblioteca();

        aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        aMinhaBiblioteca.adicionarLivro(hobbit);

        System.out.println(aMinhaBiblioteca.listarLivros());

    }
}
