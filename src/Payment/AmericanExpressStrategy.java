package Payment;

/**
 * American Express cash back bounus strategy
 */
public class AmericanExpressStrategy implements Strategy {
    private final double percentage = 0.025;

    @Override
    public double cashBackBonus(double amount) {
        return amount * percentage;
    }
}
