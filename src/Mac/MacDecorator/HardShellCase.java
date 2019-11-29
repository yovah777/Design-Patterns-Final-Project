package Mac.MacDecorator;
import Mac.Mac;

/**
 * Represents a hard shell case for a MacBookPro.
 * Has an aggregate relationship with Mac.
 */
public class HardShellCase extends CaseDecorator{
    /**
     * Mac model will price of case added to the order
     */
    Mac mac;
    /**
     * Hard shell case has been added to a MacBookPro.
     * @param mac Specific Mac object the case will be associated to.
     */
    public HardShellCase(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 49.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", Hardshell Case ";
    }
}
