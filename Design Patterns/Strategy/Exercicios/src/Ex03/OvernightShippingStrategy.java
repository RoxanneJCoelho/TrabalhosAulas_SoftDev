package Ex03;

public class OvernightShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double peso) {
        return peso * 15.0;
    }
}
