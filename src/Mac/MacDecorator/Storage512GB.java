package Mac.MacDecorator;
import Mac.Computer;
/**
 * Represents 512GB of storage feature that can be added to
 * a MacBookPro.
 */
public class Storage512GB extends StorageDecorator{

    private Computer computer;
    /**
     * Storage feaure is associated with a MacBookPro.
     * @param computer This is a MacBook
     *            it is associated to.
     */
    public Storage512GB(Computer computer){
        this.computer = computer;
    }

    @Override
    public double getCost(){
        return 400.00 + computer.getCost();
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", 512GB of Storage";
    }
}
