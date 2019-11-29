package Mac.MacDecorator;
import Mac.Mac;
/**
 * Represents 1TB of storage object that can be added to
 * a MacBookPro.
 */
public class Storage1TB extends StorageDecorator{

    Mac mac;
    /**
     * Every storage object is associated with a MacBookPro.
     * @param mac This is a MacBook
     *            it is associated to.
     */
    public Storage1TB(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 600.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", 1TB of Storage";
    }
}
