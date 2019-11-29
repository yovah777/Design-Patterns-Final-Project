package Mac.MacDecorator;
import Mac.Mac;
/**
 * Represents 512GB of storage feature that can be added to
 * a MacBookPro.
 */
public class Storage512GB extends StorageDecorator{

    Mac mac;
    /**
     * Storage feaure is associated with a MacBookPro.
     * @param mac This is a MacBook
     *            it is associated to.
     */
    public Storage512GB(Mac mac){
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 400.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", 512GB of Storage";
    }
}
