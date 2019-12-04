package Mac.MacDecorator;
import Mac.Computer;
/**
 * Represents 64GB of Memory (feature) that can be added to
 * a MacBookPro.
 * Price of specialized feature will be added to the total.
 */
public class Memory64GB extends MemoryDecorator{

    Computer computer;
    /**
     * Memory feature associated with a MacBookPro.
     * @param mac This is a MacBook
     *            it is associated to.
     */
    public Memory64GB(Computer mac) {
        this.computer = mac;
    }

    @Override
    public double getCost(){
        return 600.00 + computer.getCost();
    }

    @Override
    public String getDescription(){
        return computer.getDescription() + ", 64GB of Memory";
    }
}
