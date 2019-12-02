package Iphone;

/**
 * Iphone11Pro is specific type of Iphone11
 * It is built differently than the Iphone11Standard
 * and has a higher price.
 */
public class Iphone11Pro extends Iphone11 {

    @Override
    public double cost(){
        return 999.00;
    }

    @Override
    public String getDescription() {
        return "Iphone 11 Pro 5.8\" display ";
    }

    /**
     * Displays messages to the customer that the Iphone11Pro is being constructed.
     * It lists the specific features that are added.
     */
    public void getHardware(){
        System.out.println("Adding Textured matte glass and stainless steel ...");
        System.out.println("Adding 3 cameras to phone..." );
        System.out.println("Adding Super Retina XDR display...");
    }



}



