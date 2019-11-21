package Payment;

public class VisaStrategy implements Strategy {
    private final double percentage = 0.040;
    @Override
    public double cashBackBonus(double amount) {
        return amount * percentage;
    }

}
