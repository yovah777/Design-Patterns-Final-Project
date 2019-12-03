package OrderState;
/**
 * Represents the 'Build' state of the order process.
 */
public class BuildState implements OrderState {
    @Override
    public void printState(OrderContext orderContext) {
        System.out.println("----- Build State -----");
        orderContext.setState(this);
    }
}
