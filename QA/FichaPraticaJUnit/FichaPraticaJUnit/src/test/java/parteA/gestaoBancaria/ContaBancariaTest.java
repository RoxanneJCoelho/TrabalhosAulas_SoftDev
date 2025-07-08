package parteA.gestaoBancaria;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContaBancariaTest {

    ContaBancaria contaDaRoxie;
    ContaBancaria contaDoChe;

    @BeforeEach
    void setUp() {
        contaDaRoxie = new ContaBancaria("Roxie", 500, 2018, "Portugal", "123456789");
        contaDoChe = new ContaBancaria("Che", 200, 2021, "Espanha", "987654321");
    }

    @Test
    public void testDepositarValorNegativo(){
        assertThrows(IllegalArgumentException.class, () -> contaDaRoxie.depositar(-1));
    }

    @Test
    public void testLevantar(){
        contaDaRoxie.levantar(600);
        assertEquals(500, contaDaRoxie.getSaldo());
        contaDaRoxie.levantar(300);
        assertEquals(200.0, contaDaRoxie.getSaldo());
        assertThrows(IllegalArgumentException.class, () -> contaDaRoxie.levantar(-1));
    }

    @Test
    public void testTransferir(){
        contaDaRoxie.transferir(contaDoChe, 100);
        assertEquals(400, contaDaRoxie.getSaldo());
        assertEquals(300, contaDoChe.getSaldo());
    }

    @Test
    public void testAplicarRendimentoMensal(){
        assertEquals(500, contaDaRoxie.getSaldo());
        contaDaRoxie.aplicarRendimentoMensal(2);
        assertEquals(1500, contaDaRoxie.getSaldo());
    }

    @Test
    public void testGerarResumoConta(){
        assertEquals("Titular: Roxie, IBAN: 123456789, País: Portugal, AnoCriação: 2018, Saldo: 500.0", contaDaRoxie.gerarResumoConta());
    }



}

