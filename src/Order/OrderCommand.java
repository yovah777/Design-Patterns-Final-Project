package Order;

/**
 * Represents where Command Pattern is implemented.
 * Request/order object will contain all information about itself.
 * This interface declares method for executing command.
 */
public interface OrderCommand {

    /**
     * Sends order to the Assembler (Receiver).
     * Order can be MacbookPro or Iphone product request
     */
    public void sendOrder();
}
