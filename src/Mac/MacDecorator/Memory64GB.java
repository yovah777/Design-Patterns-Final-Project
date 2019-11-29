package Mac.MacDecorator;
import Mac.Mac;
/**
 * Represents 64GB of Memory (feature) that can be added to
 * a MacBookPro.
 * Price will be added to the total.
 */
public class Memory64GB extends MemoryDecorator{

    Mac mac;
    /**
     * Memory feature associated with a MacBookPro.
     * @param mac This is a MacBook
     *            it is associated to.
     */
    public Memory64GB(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 600.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", 64GB of Memory";
    }
}
