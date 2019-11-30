package Mac.MacDecorator;

import Mac.Computer;

/**
 * Represents a hard shell case for a MacBookPro.
 * Has an aggregate relationship with Mac.
 */
public class HardShellCase extends CaseDecorator{
    /**
     * Mac model will price of case added to the order
     */
    private Computer computer;
    /**
     * Hard shell case has been added to a MacBookPro.
     * @param computer Specific Mac object the case will be associated to.
     */
    public HardShellCase(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription(){
        return computer.getDescription() + ", Hardshell Case ";
    }

    @Override
    public double getCost() {
        return 49.00 + computer.getCost();
    }
}
