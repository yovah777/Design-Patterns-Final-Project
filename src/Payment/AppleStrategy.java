package Payment;

/**
 * Apple casch back bonus strategy.
 */
public class AppleStrategy implements Strategy {
    /**
     * 5% bonus cash back
     */
    private final double percentage = 0.05;
    @Override
    public double cashBackBonus(double amount) {
        return amount * percentage;
    }
}
