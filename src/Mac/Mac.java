package Mac;

/**
 * Represents MacBookPro product.
 * Generalizes the messages that will print out for price,
 * description, packaging, and shipping.
 */
public abstract class Mac extends Computer {
    /**
     * Identifies the MacBook Pro model
     */
    String description = "";

    /**
     * Returns price of MacBookPro.
     * @return
     */
    public abstract double getCost();

    /**
     * Returns description of specific model of MacBookPro.
     * @return
     */
    public String getDescription() {
        return description;
    }

}
