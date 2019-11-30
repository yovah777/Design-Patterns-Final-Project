package OrderState;

/**
 * State-specific method will be called by each child class.
 * Identifying the specific state the order is in.
 */
public interface OrderState {
    /**
     * Prints out the current state of the order.
     * @param orderContext   order(backreference), will be used to transition
     *                       into next state.
     */
    public void printState(OrderContext orderContext);
}
