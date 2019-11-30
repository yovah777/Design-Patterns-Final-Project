package Mac;

/**
 * Represents generalization of MacBook products
 */
public abstract class Computer {
    /**
     * Represents description of Macbook product
     */
    String description = "";

    /**
     * Displays text to the user of the Macbook model they have chosen.
     * @return  description of specific Macbook Model
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Cost of the computer
     * @return Price of Computer
     */
    public abstract double getCost();
}
