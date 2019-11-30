package Mac;

/**
 * Represents MacBookPro13.
 * It is specialization of Mac.
 */
public class MacBookPro13 extends Mac {
    /**
     * This is a form of identification as
     * it is processed through the program.
     */
    public MacBookPro13(){
        description = "MacBookPro13";
    }

    @Override
    public double getCost(){
        return 1299.00;
    }

}
