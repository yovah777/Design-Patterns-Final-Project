package Payment;

public class AmericanExpressStrategy implements Strategy {
    private final double percentage = 0.025;
    @Override
    public double reward(double amount) {
        return amount * percentage;
    }
}
