package Mac.MacDecorator;
import Mac.Mac;
/**
 * Represents a leather case for a MacBookPro.
 * Has an aggregate relationship with Mac.
 */
public class LeatherCase extends CaseDecorator{

    Mac mac;
    /**
     * Leather case has been added to a MacBookPro.
     * @param mac Specific Mac object.
     */
    public LeatherCase(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 79.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", Leather Case ";
    }
}
