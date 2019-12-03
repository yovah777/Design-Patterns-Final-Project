package OrderState;

/**
 * Represents the 'Delivery' state of the order process.
 */
public class DeliveryState implements OrderState {
    @Override
    public void printState(OrderContext orderContext) {
        System.out.printf("----- Delivery State -----");
        orderContext.setState(this);
    }
}
