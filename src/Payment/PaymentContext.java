package Payment;

/**
 * Holds a reference to one of the concrete (child) strategies.
 */
public class PaymentContext {
    /**
     * Object is communicated with through Strategy interface
     */
    private Strategy strategy;

    /**
     * Communicates through here with Strategy interface
     * @param strategy  reference to type of cashbackbonus used
     */
    public PaymentContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Cash back bonus is implemented.
     * @param amount        Amount of credit that will applied to payment order.
     * @return              Dollar amount of the bonus.
     */
    public double executeStrategy(double amount) {
//        System.out.println("Executive");
        return strategy.cashBackBonus(amount);
    }

}