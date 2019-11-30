package Mac.MacDecorator;
import Mac.Computer;

/**
 * Represents 32GB of Memory feature that can be added to
 * a MacBookPro.
 * Price will be added to the total.
 */
public class Memory32GB extends MemoryDecorator{

    private Computer computer;

    /**
     * Memory feature is associated with a MacBookPro.
     * @param computer This is a MacBook
     *            it will be associated to.
     */
    public Memory32GB(Computer computer) {
        this.computer = computer;
    }

    @Override
    public double getCost(){
        return 400.00 + computer.getCost();
    }

    @Override
    public String getDescription(){
        return computer.getDescription() + ", 32GB of Memory";
    }
}
