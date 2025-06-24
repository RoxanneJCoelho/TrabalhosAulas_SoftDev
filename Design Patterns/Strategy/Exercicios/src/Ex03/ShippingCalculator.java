package Ex03;

public class ShippingCalculator {
    private ShippingStrategy strategy;

    public ShippingCalculator(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShippingCost(double peso) {
        return strategy.calculateCost(peso);
    }

}
