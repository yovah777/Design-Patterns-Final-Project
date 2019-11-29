package Mac.MacDecorator;
import Mac.Mac;

/**
 * Represents 32GB of Memory feature that can be added to
 * a MacBookPro.
 * Price will be added to the total.
 */
public class Memory32GB extends MemoryDecorator{

    Mac mac;

    /**
     * Memory feature is associated with a MacBookPro.
     * @param mac This is a MacBook
     *            it will be associated to.
     */
    public Memory32GB(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 400.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", 32GB of Memory";
    }
}
