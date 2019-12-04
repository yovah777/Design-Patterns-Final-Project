package Mac.MacDecorator;

import Mac.Computer;

/**
 * Represents a I7 processor that will be added to a MacBookPro if chosen
 * by the customer.
 */
public class I7Processor extends ProcessorDecorator{

    private Computer computer;

    /**
     * Every processor object is associated with a MacBookPro.
     * @param computer This is the MacBook
     *            it will be associated to.
     */
    public I7Processor(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription(){
        return computer.getDescription() + ", I7 processor";
    }

    @Override
    public double getCost() {
        return 100 + computer.getCost();
    }
}
