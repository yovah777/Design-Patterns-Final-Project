package Payment;

/**
 * Common strategy used to apply 'cash back' from credit cards.
 * Declares cashBackBonus that is executed differently by child classes.
 */
public interface Strategy {
    public double cashBackBonus(double amount);
}
