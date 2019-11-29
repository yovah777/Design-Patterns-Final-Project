package Mac.MacDecorator;
import Mac.Mac;
/**
 * Represents 64GB of Memory object that can be added to
 * a MacBookPro.
 */
public class Memory64GB extends MemoryDecorator{

    Mac mac;
    /**
     * Every memory object is associated with a MacBookPro.
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
