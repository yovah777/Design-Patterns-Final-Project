package main;

import main.iphone.Iphone;
import main.mac.Mac;
import main.mac.mac_decorator.*;


// Receiver
public class Assembler {
    public static String macBookProSize = "";
    public static String iPhoneModel = "";
    public static String macBookSize = "";
    // Official decorator list
    public static String[] processorList = null;
    public static String[] memoryList = null;
    public static String[] storageList = null;
    public static String[] caseList = null;
    Mac mac;
    Iphone iphone;

    //    public static String[] colorList = null;
    //    public static String[] appleCareList = null;

    public void sendOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Mac")){
            System.out.println((macBookProSize + " order received."));

            MacFactory factory = new MacFactory();
            mac = factory.createMac(macBookProSize);
            mac.packagingMacBookOrder(macBookProSize);
            mac.shipMacBookOrder(macBookProSize);
            mac = decorate(processorList,memoryList,storageList,caseList);


            System.out.println(mac.getDescription() + " --order complete");
            System.out.println("Cost: $" + mac.cost());

        } else if (factoryType.equalsIgnoreCase("iphone")) {
            System.out.println(iPhoneModel + "order received.");

            IphoneFactory factory = new IphoneFactory();
            iphone = factory.makePhone(iPhoneModel);
            iphone.implementIphone();

            System.out.println(iphone.getDescription() + "order complete.");
            System.out.println("Cost: $" + iphone.cost());
        }
        System.out.println("");
    }

    // Mac Decorator method
    public Mac decorate(String[] processorList, String[] memoryList, String[] storageList,String[] caseList){

        // Iterate over processer decorator list
        for (int i = 0; i<processorList.length; i++){
            String processor = processorList[i];
            if (processor.equalsIgnoreCase("i7Processor")){
                mac = new I7Processor(mac);
            } else if (processor.equalsIgnoreCase("i9Processor")){
                mac = new I9Processor(mac);
            }
        }

        // Iterate over memory decorator list
        for (int i = 0; i<memoryList.length; i++){
            String memory = memoryList[i];
            if (memory.equalsIgnoreCase("Memory32GB")){
                mac = new Memory32GB(mac);
            } else if (memory.equalsIgnoreCase("Memory64GB")){
                mac = new Memory64GB(mac);
            }
        }

        // Iterate over storage decorator list
        for (int i = 0; i<storageList.length; i++){
            String storage = storageList[i];
            if (storage.equalsIgnoreCase("Storage512GB")){
                mac = new Storage512GB(mac);
            } else if (storage.equalsIgnoreCase("Storage1TB")){
                mac = new Storage1TB(mac);
            }
        }

        // Iterate over case decorator list
        for (int i = 0; i<caseList.length; i++){
            String coverCase = caseList[i];
            if (coverCase.equalsIgnoreCase("HardShellCase")){
                mac = new HardShellCase(mac);
            } else if (coverCase.equalsIgnoreCase("LeatherCase")){
                mac = new LeatherCase(mac);
            }
        }
        return mac;
    }
}
