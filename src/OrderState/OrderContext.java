package OrderState;

public class OrderContext {
    private OrderState state;

    public OrderContext(){
        state = null;
    }

    public void setState(OrderState state){
        this.state = state;
    }

    public OrderState getState(){
        return state;
    }

    public void printState() {
        state.printState(this);
    }
}
