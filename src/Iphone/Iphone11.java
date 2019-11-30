package Iphone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * Iphone11 is a version of an Iphone
 * Abstract class will contain a template method
 * and abstract method(s) that child classes will define.
 */
public abstract class Iphone11 implements Iphone {
    /**
     * Gets the price of Iphone model
     *
     * @return  price
     */
    public abstract double cost();
    /**
     * Gets description of Iphone model.
     *
     * @return  description
     */
    public abstract String getDescription();
    /**
     * Template method used.
     * Several methods are used here to construct Iphone11
     * getHardware() is a hook that makes this a Template Pattern.
     */
    @Override
    public void implementIphone() {
        designIphone();
        prepareIOSsoftware();
        getHardware();

        if (customerWantsEngraving()) {
            addEngraving();
        }
    }
    /**
     * Prints out confirmation for customer that Iphone11 is being designed.
     */
    public void designIphone() {
        System.out.println("Designing new iPhone...");
    }

    /**
     * Prints out software being implemented into Iphone11
     */
    public void prepareIOSsoftware() {
        System.out.println("Adding new IOS into iPhone...");
    }

    /**
     * Hook method.  Child classes must define hardware features that construct model type.
     */
    public abstract void getHardware();

    /**
     * Asks user what they would like to specifically engrave into their Iphone, if 'yes', engraving added.
     */
    public void addEngraving() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your engraving :  ");
        String value = scanner.nextLine();
        System.out.println("Adding " + value + " customized engraving to device...");
    }
    /**
     * Returns true if engraving feature is used.
     * This is another possible hook method.
     *
     * @return
     */
    public boolean customerWantsEngraving() {
        String engravingName = getEngravingName();

        if (engravingName.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Asks customer if they would like to add an engraving.
     *
     * @return Customer's answer (yes or no)
     */
    private String getEngravingName() {
        String customerResponse = null;
        System.out.println("Would you like to add an engraving name to your Apple device? y/n");

        BufferedReader engravingName = new BufferedReader(new InputStreamReader(System.in));

        try {
            customerResponse = engravingName.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (customerResponse == null) {
            customerResponse = "no";
        }
        return customerResponse;
    }
}
