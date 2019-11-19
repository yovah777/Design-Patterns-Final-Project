package Payment;

public class AppleStrategy implements Strategy {
    private final double percentage = 0.03;
    @Override
    public double reward(double amount) {
        return amount * percentage;
    }
}
