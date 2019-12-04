package OrderState;
/**
 * Represents the 'Cancel' state of the order process.
 */
public class CancelState implements OrderState {
    @Override
    public void printState(OrderContext orderContext) {
        System.out.println("----- Canceling State -----");
        orderContext.setState(this);
    }
}
