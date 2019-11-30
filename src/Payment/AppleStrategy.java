package Payment;

/**
 * Apple casch back bonus strategy.
 */
public class AppleStrategy implements Strategy {
    /**
     * 3% bonus cash back
     */
    private final double percentage = 0.03;
    @Override
    public double cashBackBonus(double amount) {
        return amount * percentage;
    }
}
