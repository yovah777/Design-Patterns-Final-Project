package Payment;

/**
 * Visa cash back bonus strategy.
 */
public class VisaStrategy implements Strategy {
    /**
     * 3.5% bonus cash back
     */
    private final double percentage = 0.035;
    @Override
    public double cashBackBonus(double amount) {
        return amount * percentage;
    }

}