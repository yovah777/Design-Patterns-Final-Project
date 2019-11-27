package OrderState;

public class DeliveryState implements OrderState {
    @Override
    public void printState(OrderContext orderContext) {
        System.out.printf("Delivery state");
        orderContext.setState(this);
    }
}
