package Ex03;

public class ExpressShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double peso) {
        return peso * 10.0;
    }
}
