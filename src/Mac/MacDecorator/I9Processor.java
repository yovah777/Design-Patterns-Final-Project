package Mac.MacDecorator;
import Mac.Computer;
/**
 * Represents a I9 processor that will be added to a MacBookPro if chosen
 * by the customer.
 */
public class I9Processor extends ProcessorDecorator{

    private Computer computer;
    /**
     * Every processor object is associated with a MacBookPro.
     * @param computer This is a MacBook
     *            it will be associated to.
     */
    public I9Processor(Computer computer) {
        this.computer = computer;
    }

    @Override
    public double getCost(){
        return 300.00 + computer.getCost();
    }

    @Override
    public String getDescription(){
        return computer.getDescription() + ", I9 processor";
    }
}
