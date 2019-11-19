package Payment;

public class VisaStrategy implements Strategy {
    private final double percentage = 0.040;
    @Override
    public double reward(double amount) {
        return amount * percentage;
    }
}
