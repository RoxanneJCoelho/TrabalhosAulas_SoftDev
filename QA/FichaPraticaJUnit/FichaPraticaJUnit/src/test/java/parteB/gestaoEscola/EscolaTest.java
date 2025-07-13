package parteB.gestaoEscola;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    Aluno roxie;
    Aluno michele;
    Aluno alexandra;
    Professor vitor;
    Professor alexandre;

    Escola cesae;



    @BeforeEach
    void setUp() {
        roxie = new Aluno(1, "Roxie", 2000, "Mestrado", "Portuguesa", "Povoa", "roxie@gmail.com", "911526060");
        michele = new Aluno(2, "Michele", 1970, "12 Ano", "Brasileira", "Vila", "michele@gmail.com", "255440469");
        vitor = new Professor(1, "Vitor", "Java", "vitor@gmail.com", "9112345678");
        alexandre = new Professor(2, "Alexandre", "SQL", "alexandre@gmail.com", "9374849595");
        cesae = new Escola();
        alexandra = new Aluno(3, "Alexandra", 1984, "Mestrado", "Portuguesa", "Trofa", "alexandra@gmail.com", "74879304");
    }

    @Test
    public void testPesquisarAlunoPorNumero(){
        cesae.adicionarAluno(roxie);
        cesae.adicionarAluno(michele);

        assertEquals(roxie, cesae.pesquisarAlunoPorNumero(1));
        assertEquals(michele, cesae.pesquisarAlunoPorNumero(2));

    }

    @Test
    public void testPesquisarProfessorporID(){
        cesae.adicionarProfessor(vitor);
        cesae.adicionarProfessor(alexandre);

        assertEquals(vitor, cesae.pesquisarProfessorPorId(1));
        assertEquals(alexandre, cesae.pesquisarProfessorPorId(2));
    }

    @Test
    public void testObterMelhorAluno(){

        cesae.adicionarAluno(roxie);
        cesae.adicionarAluno(michele);

        roxie.adicionarNota(16);
        roxie.adicionarNota(18);
        michele.adicionarNota(15);
        michele.adicionarNota(17);

        assertEquals(roxie, cesae.obterMelhorAluno());

    }

    @Test
    public void testAlunosReprovados(){
        cesae.adicionarAluno(roxie);
        cesae.adicionarAluno(michele);

        roxie.adicionarNota(16);
        roxie.adicionarNota(18);
        michele.adicionarNota(15);
        michele.adicionarNota(17);

        assertEquals(michele, cesae.alunosReprovados(16));

    }

    @Test
    public void testAlunosPorNacionalidade(){

        cesae.adicionarAluno(roxie);
        cesae.adicionarAluno(michele);
        cesae.adicionarAluno(alexandra);

        ArrayList<Aluno> esperado = new ArrayList<>();
        esperado.add(roxie);
        esperado.add(alexandra);

        ArrayList<Aluno> resultado = cesae.alunosPorNacionalidade("Portuguesa");

        assertEquals(esperado, resultado);
    }

    @Test
    public void testProfessorPorEspecialidade(){
        cesae.adicionarProfessor(vitor);
        cesae.adicionarProfessor(alexandre);

        ArrayList<Professor> esperado = new ArrayList<>();
        esperado.add(vitor);

        ArrayList<Professor> resultado = cesae.professoresPorEspecialidade("Java");

        assertEquals(esperado, resultado);
    }

    @Test
    public void testRemoverAlunoPorNumero(){
        cesae.adicionarAluno(roxie);
        cesae.adicionarAluno(michele);
        cesae.adicionarAluno(alexandra);

        cesae.removerAlunoPorNumero(3);
        assertEquals(2, cesae.numeroTotalAlunos());

    }

    @Test
    public void testRemoverProfessorPorID(){
        cesae.adicionarProfessor(vitor);
        cesae.adicionarProfessor(alexandre);

        cesae.removerProfessorPorId(1);
        assertEquals(1, cesae.numeroTotalProfessores());

    }

    @Test
    public void testNumeroTotalPessoas(){
        cesae.adicionarAluno(roxie);
        cesae.adicionarAluno(michele);
        cesae.adicionarAluno(alexandra);
        cesae.adicionarProfessor(vitor);
        cesae.adicionarProfessor(alexandre);

        assertEquals(5, cesae.numeroTotalPessoas());

    }
}

