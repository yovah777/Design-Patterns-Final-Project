package Order;

import Factory.IphoneFactory;
import Factory.MacFactory;
import Iphone.Iphone;
import Mac.Mac;
import Mac.MacDecorator.*;

/**
 * Represents an Assembeler that receives (Receiver) an order of different products.
 *
 */
public class Assembler {
    public static double totalCost = 0.0;
    public String macBookProSize = "";
    public String iPhoneModel = "";
    public String macBookSize = "";
    // Official decorator list
    public String[] processorList = null;
    public String[] memoryList = null;
    public String[] storageList = null;
    public String[] caseList = null;
    Mac mac;
    Iphone iphone;

    /**
     * Order is managed and sent to facorties for product retrieval/configuration.
     *
     * @param factoryType Factory associated to the type of product.
     */
    public void sendOrder(String factoryType) {
        if (factoryType.equalsIgnoreCase("Mac")) {
            System.out.println((macBookProSize + " order received."));

            MacFactory factory = new MacFactory();
            mac = factory.createMac(macBookProSize);
            mac.packagingMacBookOrder(macBookProSize);
            mac.shipMacBookOrder(macBookProSize);
            mac = decorate(processorList, memoryList, storageList, caseList);


            System.out.println(mac.getDescription() + " --order complete");
            System.out.println("Cost: $" + mac.cost());
            totalCost += mac.cost();
        } else if (factoryType.equalsIgnoreCase("iphone")) {
            System.out.println(iPhoneModel + "order received.");

            IphoneFactory factory = new IphoneFactory();
            iphone = factory.makePhone(iPhoneModel);
            iphone.implementIphone();

            System.out.println(iphone.getDescription() + "order complete.");
            System.out.println("Cost: $" + iphone.cost());
            totalCost += iphone.cost();
        }
        System.out.println("");
    }

    /**
     * MacBook Pro gets specific features added to it based on the order
     * @param processorList specific processor
     * @param memoryList    specific amount of memory
     * @param storageList   specific amount of storage
     * @param caseList      specific case
     * @return
     */
    public Mac decorate(String[] processorList, String[] memoryList, String[] storageList, String[] caseList) {

        // Iterate over processer decorator list
        for (int i = 0; i < processorList.length; i++) {
            String processor = processorList[i];
            if (processor.equalsIgnoreCase("i7Processor")) {
                mac = new I7Processor(mac);
            } else if (processor.equalsIgnoreCase("i9Processor")) {
                mac = new I9Processor(mac);
            }
        }

        // Iterate over memory decorator list
        for (int i = 0; i < memoryList.length; i++) {
            String memory = memoryList[i];
            if (memory.equalsIgnoreCase("Memory32GB")) {
                mac = new Memory32GB(mac);
            } else if (memory.equalsIgnoreCase("Memory64GB")) {
                mac = new Memory64GB(mac);
            }
        }

        // Iterate over storage decorator list
        for (int i = 0; i < storageList.length; i++) {
            String storage = storageList[i];
            if (storage.equalsIgnoreCase("Storage512GB")) {
                mac = new Storage512GB(mac);
            } else if (storage.equalsIgnoreCase("Storage1TB")) {
                mac = new Storage1TB(mac);
            }
        }

        // Iterate over case decorator list
        for (int i = 0; i < caseList.length; i++) {
            String coverCase = caseList[i];
            if (coverCase.equalsIgnoreCase("HardShellCase")) {
                mac = new HardShellCase(mac);
            } else if (coverCase.equalsIgnoreCase("LeatherCase")) {
                mac = new LeatherCase(mac);
            }
        }
        return mac;
    }

}
