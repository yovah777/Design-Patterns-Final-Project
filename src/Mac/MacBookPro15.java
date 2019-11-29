package Mac;
/**
 * Represents MacBookPro15.
 * It is specialization of Mac.
 */
public class MacBookPro15 extends Mac {
    /**
     * This is a form of identification as
     * it is processed through the program.
     */
    public MacBookPro15(){
        description = "MacBookPro15";
    }

    @Override
    public double cost(){
        return 2399.00;
    }
}
