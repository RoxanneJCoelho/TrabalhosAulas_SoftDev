package parteB.gestaoBiblioteca;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BibliotecaTest {

    Livro headsFirstJava;
    Livro hobbit;
    Livro principezinho;

    Biblioteca aMinhaBiblioteca;

    @BeforeEach
    void setUp() {
        this.headsFirstJava = new Livro("Heads First Java", "Kathy Sierra", 2015, 760);
        this.hobbit = new Livro("Hobbit", "Tolkien", 2000, 600);
        this.principezinho= new Livro("O Princepizinho","Gajo Francês",1990,100);

        this.aMinhaBiblioteca = new Biblioteca();
    }

    @Test
    public void testAdicionarLivro() {
        assertEquals(0, this.aMinhaBiblioteca.contarLivros());

        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);

        assertEquals(1, this.aMinhaBiblioteca.contarLivros());

        this.aMinhaBiblioteca.adicionarLivro(hobbit);

        assertEquals(2, this.aMinhaBiblioteca.contarLivros());

        //assertEquals("Título: Heads First Java, Autor: Kathy Sierra, Ano: 2015, Páginas: 760, Estado: disponível\nTítulo: Hobbit, Autor: Tolkien, Ano: 2000, Páginas: 600, Estado: disponível", this.aMinhaBiblioteca.listarLivros());
        //assertEquals(this.headsFirstJava.obterResumo() + "\n" + this.hobbit.obterResumo(), this.aMinhaBiblioteca.listarLivros());

    }

    @Test
    public void testRemoverLivroPorTitulo() {
        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        this.aMinhaBiblioteca.adicionarLivro(hobbit);

        this.aMinhaBiblioteca.removerLivroPorTitulo("Heads First Java");

        assertEquals(1, this.aMinhaBiblioteca.contarLivros());

        assertEquals(this.hobbit.obterResumo(), this.aMinhaBiblioteca.listarLivros());

    }

    @Test
    public void testPesquisarLivroPorTitulo() {

        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        this.aMinhaBiblioteca.adicionarLivro(hobbit);


        assertEquals(headsFirstJava, this.aMinhaBiblioteca.pesquisarLivroPorTitulo("Heads First Java"));

    }

    @Test
    public void testContarLivros() {

        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        this.aMinhaBiblioteca.adicionarLivro(hobbit);

        assertEquals(2, this.aMinhaBiblioteca.contarLivros());

    }

    @Test
    public void testContarLivrosPorAutor() {
        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        this.aMinhaBiblioteca.adicionarLivro(hobbit);

        assertEquals(1, this.aMinhaBiblioteca.contarLivrosPorAutor("Kathy Sierra"));

    }

    @Test
    public void testListarLivros() {

        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        this.aMinhaBiblioteca.adicionarLivro(hobbit);

        assertEquals("Título: Heads First Java, Autor: Kathy Sierra, Ano: 2015, Páginas: 760, Estado: disponível\n" +
                "Título: Hobbit, Autor: Tolkien, Ano: 2000, Páginas: 600, Estado: disponível", aMinhaBiblioteca.listarLivros());

        assertEquals(headsFirstJava.obterResumo() + "\n" + hobbit.obterResumo(), aMinhaBiblioteca.listarLivros());
    }

    @Test
    public void testGerarRelatorioBiblioteca(){

        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        this.aMinhaBiblioteca.adicionarLivro(hobbit);

        assertEquals("Total de livros: " + 2 + "\n" + aMinhaBiblioteca.listarLivros(), aMinhaBiblioteca.gerarRelatorioBiblioteca());
    }

    @Test
    public void testObterLivrosDisponiveis(){

        this.principezinho.emprestar();

        this.aMinhaBiblioteca.adicionarLivro(principezinho);
        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        this.aMinhaBiblioteca.adicionarLivro(hobbit);

        assertEquals(2,aMinhaBiblioteca.obterLivrosDisponiveis().size());

        assertEquals(headsFirstJava,aMinhaBiblioteca.obterLivrosDisponiveis().get(0));
        assertEquals(hobbit,aMinhaBiblioteca.obterLivrosDisponiveis().get(1));

    }

    @Test
    public void testObterLivrosIndisponiveis(){
        this.principezinho.emprestar();

        this.aMinhaBiblioteca.adicionarLivro(principezinho);
        this.aMinhaBiblioteca.adicionarLivro(headsFirstJava);
        this.aMinhaBiblioteca.adicionarLivro(hobbit);

        assertEquals(1,aMinhaBiblioteca.obterLivrosDisponiveis().size());

        assertEquals(principezinho,aMinhaBiblioteca.obterLivrosDisponiveis().get(0));

    }

}