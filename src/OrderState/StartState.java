package OrderState;

/**
 * Represents the 'Start' state of the order process.
 */
public class StartState implements OrderState {
    @Override
    public void printState(OrderContext orderContext) {
        System.out.println("Start order state");
        orderContext.setState(this);
    }

}
