package Iphone;

/**
 * Represents an Iphone in the store
 * There are currently two models of Iphone
 * Iphone11Pro and Iphone11Standard
 */
public interface Iphone {
    /**
     * Gets the specific (description) model of Iphone.
     * @return description
     */
    public String getDescription();
    /**
     * Returns the price of an Iphone.
     * @return price
     */
    public double cost();
    /**
     * Child classes will have template method defined inside.
     * Defining the methods that will construct an Iphone.
     */
    public void implementIphone();
}
