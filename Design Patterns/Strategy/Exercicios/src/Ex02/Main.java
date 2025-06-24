package Ex02;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor pp = new PaymentProcessor(new NoDiscountStrategy());
        System.out.println(pp.calculateTotal(100));

        pp.setDiscountStrategy(new FlatDiscountStrategy(20));
        System.out.println(pp.calculateTotal(100));

        pp.setDiscountStrategy(new PercentagemDiscountStrategy(0.15));
        System.out.println(pp.calculateTotal(500));

    }
}
