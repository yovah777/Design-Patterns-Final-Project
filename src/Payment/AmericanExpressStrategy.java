package Payment;

/**
 * American Express cash back bonus strategy
 */
public class AmericanExpressStrategy implements Strategy {
    /**
     * 2.5% bonus cash back
     */
    private final double percentage = 0.025;

    @Override
    public double cashBackBonus(double amount) {
        return amount * percentage;
    }
}
