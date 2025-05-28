package Ex08;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adquirirStock(int numero){
        this.quantidade += numero;
    }
    public void venderProduto(int stock) {
        if (stock <= 0) {
            System.out.println("Quantidade inválida. Introduza um valor positivo.");
            return;
        }

        if (stock <= quantidade) {
            double total = stock * preco;
            quantidade -= stock;
            System.out.println("Venda realizada com sucesso!");
            System.out.println("Produto: " + nome);
            System.out.println("Quantidade: " + stock);
            System.out.println("Total: " + total + " €");
            System.out.println("Stock restante: " + stock);
        } else {
            System.out.println("Stock insuficiente! Apenas " + stock + " unidades disponíveis.");
        }
    }
}
