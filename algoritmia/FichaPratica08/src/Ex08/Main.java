package Ex08;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 1.50, 10);

        p1.venderProduto(4);  // Deve realizar a venda
        p1.venderProduto(7);  // Vai falhar por falta de stock
        p1.venderProduto(0);  // Quantidade inválida
    }
}
