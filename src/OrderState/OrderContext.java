package OrderState;

/**
 * Holds reference to one of concrete state objects.
 */
public class OrderContext {
    private OrderState state;

    /**
     * backreference starts at null
     */
    public OrderContext(){
        state = null;
    }

    /**
     * Changes state of the order
     * @param state reference point to state of the order process
     */
    public void setState(OrderState state){
        this.state = state;
    }

    /**
     * Retrieves state of the order process
     * @return  specific point in the order process.
     */
    public OrderState getState(){
        return state;
    }

    /**
     * Prints out description of state object (What state the order is in).
     */
    public void printState() {
        state.printState(this);
    }
}
