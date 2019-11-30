package Order;

import Factory.IphoneFactory;
import Factory.MacFactory;
import Iphone.Iphone;
import Mac.Mac;
import Mac.MacDecorator.*;

/**
 * Represents an Assembler that receives (Receiver) an order of different products.
 */
public class Assembler {
    private double totalIphoneCost = 0.0;

    private Iphone iphone;

    /**
     * Order is managed and sent to factories for product retrieval/configuration.
     *
     * @param factoryType Factory associated to the type of product.
     */
    public void sendOrder(String factoryType, String iPhoneModel) {
        String order = iPhoneModel;
        if (factoryType.equalsIgnoreCase("iphone")) {
            System.out.println(order + "order received.");

            IphoneFactory factory = new IphoneFactory();
            iphone = factory.makePhone(order);
            iphone.implementIphone();

            System.out.println(iphone.getDescription() + "order complete.");
            System.out.println("Cost: $" + iphone.cost());
            totalIphoneCost = iphone.cost();
        }
        System.out.println("");
    }

    public double getIphoneCost() {
        return totalIphoneCost;
    }
}
