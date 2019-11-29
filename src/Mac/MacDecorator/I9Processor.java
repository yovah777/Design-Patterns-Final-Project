package Mac.MacDecorator;
import Mac.Mac;
/**
 * Represents a I9 processor that will be added to a MacBookPro if chosen
 * by the customer.
 */
public class I9Processor extends ProcessorDecorator{

    Mac mac;
    /**
     * Every processor object is associated with a MacBookPro.
     * @param mac This is a MacBook
     *            it will be associated to.
     */
    public I9Processor(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 300.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", I9 processor";
    }
}
