package Iphone;

/**
 * Represents an Iphone in the store
 * There are currently two models of Iphone
 * Iphone11 and Iphone11Pro
 */
public interface Iphone {
    /**
     * Gets the specific (description) model of Iphone.
     * @return
     */

    public String getDescription();
    /**
     * Returns the price of an Iphone.
     * @return
     */
    public double cost();

    /**
     * Child classes will have template method defined inside.
     * Defining the methods that will construct an Iphone.
     */
    public void implementIphone();
}
