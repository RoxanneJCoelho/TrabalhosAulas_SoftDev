package Ex03;

public class StandardShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double peso) {
        return peso * 5.0;
    }
}


