package Ex02;

public class Edificio {
    private String nome;
    private String rua;
    private String cidade;
    private String cor_fachada;
    private int numero_andares;
    private boolean garagem;

    public Edificio(String nome, String rua, String cidade, String cor_fachada, int numero_andares, boolean garagem) {
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.cor_fachada = cor_fachada;
        this.numero_andares = numero_andares;
        this.garagem = garagem;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRua(){
        return this.rua;
    }

    public String getCidade(){
        return this.cidade;
    }

    public String getCor_fachada(){
        return this.cor_fachada;
    }

    public int getNumero_andares(){
        return this.numero_andares;
    }

    public boolean getGaragem(){
        return this.garagem;
    }

    public void setCor_fachada(String cor_fachada) {
        this.cor_fachada = cor_fachada;
    }
}
