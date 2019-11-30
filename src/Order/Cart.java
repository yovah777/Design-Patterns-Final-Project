package Order;

import Order.OrderCommand;

/**
 * This is our 'invoker' (command patten).
 * The cart will hold product orders added to itself.
 */
public class Cart {
    OrderCommand appleCommand;

    /**
     *  Order added to cart
     * @param order
     */
    public void addToCart(OrderCommand order){
        appleCommand = order;
        appleCommand.sendOrder(); //Calling on Order.OrderCommand interface
    }
}
