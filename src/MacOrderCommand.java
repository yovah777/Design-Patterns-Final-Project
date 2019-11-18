/**
 * Represents a MacBookPro order that will be sent to Assembler.
 * Order includes features that will be added to specific type of MacBookPro.
 */
public class MacOrderCommand implements OrderCommand{
    Assembler assembler;
    String[] processorList, memoryList, storageList, caseList;
    String order;

    /**
     * Constructor holds fine details of what Assembler needs to verify order matches
     * of what the customer is purchasing.
     * @param assembler Identifies Assember that will receieve order.
     * @param order Holds details.
     * @param processorList Type of processor
     * @param memoryList    Type of memory
     * @param storageList   Type of storage
     * @param caseList      Type of case
     */
    public MacOrderCommand(Assembler assembler, String order, String[]processorList, String[] memoryList, String[] storageList,String[] caseList){
        this.assembler = assembler;
        this.order = order;
        this.processorList = processorList;
        this.memoryList = memoryList;
        this.storageList = storageList;
        this.caseList = caseList;
    }

    /**
     * Sends order to the Assembler.
     */
    public void sendOrder(){
        assembler.macBookProSize = order;
        assembler.processorList = this.processorList;
        assembler.memoryList = this.memoryList;
        assembler.storageList = this.storageList;
        assembler.caseList = this.caseList;

        assembler.sendOrder("Mac");
    }
}

