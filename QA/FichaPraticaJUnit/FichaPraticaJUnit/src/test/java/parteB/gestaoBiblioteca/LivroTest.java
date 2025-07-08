package parteB.gestaoBiblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Livro headsFirstJava;
    Livro hobbit;

    @BeforeEach
    void setUp() {
        this.headsFirstJava = new Livro("Heads First Java", "Kathy Sierra", 2015, 760);
        this.hobbit = new Livro("Hobbit", "Tolkien", 2000, 600);
    }
    @Test
    public void testEstarDisponivel(){
        assertEquals(true, headsFirstJava.estaDisponivel());
        hobbit.emprestar();
        assertEquals(false, hobbit.estaDisponivel());
    }

    @Test
    public void testObterResumo(){

    }

}