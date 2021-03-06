package Mac.MacDecorator;
import Mac.Computer;
/**
 * Represents a leather case for a MacBookPro.
 */
public class LeatherCase extends CaseDecorator{

    private Computer computer;
    /**
     * Leather case has been added to a MacBookPro.
     * @param computer Specific MacBook object.
     */
    public LeatherCase(Computer computer) {
        this.computer = computer;
    }

    @Override
    public double getCost(){
        return 79.00 + computer.getCost();
    }

    @Override
    public String getDescription(){
        return computer.getDescription() + ", Leather Case ";
    }
}
