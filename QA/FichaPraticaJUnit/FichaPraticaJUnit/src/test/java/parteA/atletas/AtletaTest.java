package parteA.atletas;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtletaTest {
    Atleta roxie;
    Atleta joana;

    @BeforeEach
    void setUp() {
        roxie = new Atleta("Roxie", 25, "Andebol", "Boavista");
        joana = new Atleta("Joana", 25, "Trialto", "Boavista");
    }

    @Test
    void competir() {
        assertEquals("Competiu com tempo: 90.5 segundos", roxie.competir(90.5));
        assertEquals("Competiu com tempo: -30.0 segundos", joana.competir(-30));
    }

    @Test
    void treinar() {
        roxie.treinar(50);
        assertEquals(50, roxie.getTotalHorasTreino());
        roxie.treinar(40);
        assertEquals(90, roxie.getTotalHorasTreino());

        joana.treinar(20);
        assertEquals(20, joana.getTotalHorasTreino());
        joana.treinar(-10);
        assertEquals(10, joana.getTotalHorasTreino());
    }

    @Test
    void adicionarMedalha() {
        roxie.adicionarMedalha();
        assertEquals(1, roxie.getTotalMedalhas());
        roxie.adicionarMedalha();
        assertEquals(2, roxie.getTotalMedalhas());

        joana.adicionarMedalha();
        assertEquals(1, joana.getTotalMedalhas());
        joana.adicionarMedalha();
        assertEquals(2,joana.getTotalMedalhas());

    }

    @Test
    void atualizarRecorde() {
        roxie.atualizarRecorde(21);
        assertEquals(21.0, roxie.getRecorde());
        roxie.atualizarRecorde(2);
        assertEquals(2.0, roxie.getRecorde());

        joana.atualizarRecorde(30.5);
        assertEquals(30.5, joana.getRecorde());
        joana.atualizarRecorde(22.12);
        assertEquals(22.12, joana.getRecorde());

    }

    @Test
    void mudarClube() {
        roxie.mudarClube("Porto");
        assertEquals("Porto", roxie.getClube());
        roxie.mudarClube("Benfica");
        assertEquals("Benfica", roxie.getClube());

        joana.mudarClube("Madrid");
        assertEquals("Madrid", joana.getClube());
        joana.mudarClube("Barcelona");
        assertEquals("Barcelona", joana.getClube());
    }

    @Test
    void descansar() {
        roxie.descansar();
        assertEquals(0, roxie.getTotalHorasTreino());

        joana.descansar();
        assertEquals(0, joana.getTotalHorasTreino());
    }

    @Test
    void gerarPerfilAtleta() {
        assertEquals("Nome: Roxie, Idade: 25, Modalidade: Andebol, Clube: Boavista, Medalhas: 0, Recorde: 99999.0 s, Horas de Treino: 0.0", roxie.gerarPerfilAtleta());
    }
}