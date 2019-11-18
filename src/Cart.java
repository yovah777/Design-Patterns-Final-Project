/**
 * This is our 'invoker' (command patten).
 * The cart will hold products added to itself.
 */
public class Cart {
    OrderCommand appleCommand;

    /**
     *  Order sent
     * @param a
     */
    public void addToCart(OrderCommand a){
        appleCommand = a;
        appleCommand.sendOrder(); //Calling on OrderCommand interface
    }
}
