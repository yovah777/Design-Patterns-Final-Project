package Mac;
/**
 * Represents MacBookPro15.
 * It is specialization of Mac.
 */
public class MacBookPro15 extends Mac {
    /**
     * Constructor used as a form of identification as
     * it is processed through the program.
     * Assigning name of the product to the description.
     */
    public MacBookPro15(){
        description = "MacBookPro15";
    }

    @Override
    public double getCost(){
        return 2399.00;
    }
}
