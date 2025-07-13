package parteB.gestaoEscola;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    Aluno roxie;

    @BeforeEach
    void setUp() {
        roxie = new Aluno(1, "Roxie", 2000,"Mestrado", "Portuguesa", "Povoa De Varim", "1003rjc@gmail.com", "911526060");
    }

    @Test
    public void testCalcularMedia(){
        roxie.adicionarNota(16);
        roxie.adicionarNota(14);
        roxie.adicionarNota(12);

        assertEquals(14, roxie.calcularMedia());
    }

    @Test
    public void testNotaMaisAlta(){
        roxie.adicionarNota(16);
        roxie.adicionarNota(14);
        roxie.adicionarNota(12);

        assertEquals(16, roxie.notaMaisAlta());

    }

    @Test
    public void testNotaMaisBaixa(){
        roxie.adicionarNota(16);
        roxie.adicionarNota(14);
        roxie.adicionarNota(12);

        assertEquals(12, roxie.notaMaisBaixa());

    }
}