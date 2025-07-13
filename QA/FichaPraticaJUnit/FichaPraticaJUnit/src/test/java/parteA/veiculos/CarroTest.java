package parteA.veiculos;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carroDaRoxie;
    Carro carroDoVitor;

    @BeforeEach
    void setUp() {
        carroDaRoxie = new Carro("Fiat", "500", 2019, 200, 4, TipoCombustivel.GASOLINA, 5);
        carroDoVitor = new Carro("Mercedes", "A620", 2000, 500, 5, TipoCombustivel.DIESEL, 7);
    }

    @Test
    public void testIdade(){
        assertEquals(6, carroDaRoxie.idade());
        assertEquals(25, carroDoVitor.idade());
    }

    @Test
    public void testCarro(){
        assertEquals(carroDoVitor, carroDaRoxie.corrida(carroDoVitor));
    }

    @Test
    public void testCalcularConsumoViagem(){
        assertEquals(20, carroDaRoxie.calcularConsumoViagem(400));
    }
}