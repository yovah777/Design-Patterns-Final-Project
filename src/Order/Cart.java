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
     * @param a
     */
    public void addToCart(OrderCommand a){
        appleCommand = a;
        appleCommand.sendOrder(); //Calling on Order.OrderCommand interface
    }
}
