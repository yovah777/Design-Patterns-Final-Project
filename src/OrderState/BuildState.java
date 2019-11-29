package OrderState;

public class BuildState implements OrderState {
    @Override
    public void printState(OrderContext orderContext) {
        System.out.println("Build state");
        orderContext.setState(this);
    }
}
