package Payment;

/**
 * Common strategy used to apply 'cash back' from credit cards.
 * Declares cashBackBonus that is executed differently by child classes.
 */
public interface Strategy {
    /**
     * Returns amount of cashBack earned based on certain strategy
     * @param amount    Total cost of the order
     * @return      Amount of cash back (percentage) based on total cost of order.
     */
    public double cashBackBonus(double amount);
}
