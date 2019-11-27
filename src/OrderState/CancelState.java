package OrderState;

public class CancelState implements OrderState {
    @Override
    public void printState(OrderContext orderContext) {
        System.out.println("Canceling state");
        orderContext.setState(this);
    }
}
