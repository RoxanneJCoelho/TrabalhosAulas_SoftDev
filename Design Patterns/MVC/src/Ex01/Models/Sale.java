package Ex01.Models;

public class Sale {
    private String tipoProduto;
    private String nomeProduto;
    private double quantidadeVenda;
    private double precoUnitario;

    public Sale(String tipoProduto, String nomeProduto, double quantidadeVenda, double precoUnitario) {
        this.tipoProduto = tipoProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeVenda = quantidadeVenda;
        this.precoUnitario = precoUnitario;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
