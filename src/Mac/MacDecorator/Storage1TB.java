package Mac.MacDecorator;
import Mac.Computer;
/**
 * Represents 1TB of storage object that can be added to
 * a MacBookPro.
 */
public class Storage1TB extends StorageDecorator{

    private Computer computer;
    /**
     * Storage feature is added to a MacBookPro.
     * @param computer This is a MacBook
     *            it is associated to.
     */
    public Storage1TB(Computer computer) {
        this.computer = computer;
    }

    @Override
    public double getCost(){
        return 600.00 + computer.getCost();
    }

    @Override
    public String getDescription(){
        return computer.getDescription() + ", 1TB of Storage";
    }
}
