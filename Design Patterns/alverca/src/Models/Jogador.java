package Models;

public class Jogador {
    private int numero;
    private String nome;
    private int idade;
    private String nacionalidade;
    private int rankingDefesa;
    private int rankingAtaque;
    private int valorCompra;

    public Jogador(int numero, String nome, int idade, String nacionalidade, int rankingDefesa, int rankingAtaque, int valorCompra) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.rankingDefesa = rankingDefesa;
        this.rankingAtaque = rankingAtaque;
        this.valorCompra = valorCompra;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getRankingDefesa() {
        return rankingDefesa;
    }

    public int getRankingAtaque() {
        return rankingAtaque;
    }

    public int getValorCompra() {
        return valorCompra;
    }
}
