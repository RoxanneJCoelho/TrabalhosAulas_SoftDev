package Ex02;

public class PercentagemDiscountStrategy implements PaymentStrategy {

    private double discountPercentage;

    public PercentagemDiscountStrategy(double discountPercentage) {

        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Desconto não pode ser menor que 0 nem maior que 100");
        }

        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateTotal(double valor) {
        return valor * (1 - discountPercentage);
    }
}
