package Payment;

public class PaymentContext {
    private Strategy strategy;

    public PaymentContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double amount) {
        System.out.println("Executive");
        return strategy.cashBackBonus(amount);
    }

}