package Payment;

/**
 * Visa cash back bonus strategy.
 */
public class VisaStrategy implements Strategy {
    /**
     * 4% bonus cash back
     */
    private final double percentage = 0.040;
    @Override
    public double cashBackBonus(double amount) {
        return amount * percentage;
    }

}
