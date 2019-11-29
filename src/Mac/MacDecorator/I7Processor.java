package Mac.MacDecorator;
import Mac.Mac;

/**
 * Represents a I7 processor that will be added to a MacBookPro if chosen
 * by the customer.
 */
public class I7Processor extends ProcessorDecorator{

    Mac mac;

    /**
     * Every processor object is associated with a MacBookPro.
     * @param mac This is a MacBook
     *            it will be associated to.
     */
    public I7Processor(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 100.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", I7 processor";
    }
}
