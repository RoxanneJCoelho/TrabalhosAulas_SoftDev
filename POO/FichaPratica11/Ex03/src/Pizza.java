import Enums.TamanhoPizza;

public class Pizza {
    final int MAX_INGREDIENTES = 5;
    int id;
    String nome;
    String descricao;
    double preco;
    TamanhoPizza tamanhoPizza;
    IngredientePizza[] ingredientes;

    public Pizza(int id, String nome, String descricao, double preco, TamanhoPizza tamanhoPizza) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanhoPizza = tamanhoPizza;
        this.ingredientes = new IngredientePizza[MAX_INGREDIENTES];


    }

    public int getMAX_INGREDIENTES() {
        return MAX_INGREDIENTES;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public TamanhoPizza getTamanhoPizza() {
        return tamanhoPizza;
    }

    public IngredientePizza[] getIngredientes() {
        return ingredientes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTamanhoPizza(TamanhoPizza tamanhoPizza) {
        this.tamanhoPizza = tamanhoPizza;
    }

    public void setIngredientes(IngredientePizza[] ingredientes) {
        this.ingredientes = ingredientes;
    }




}
