package main;

public class MacOrderCommand implements OrderCommand{
    Assembler assembler;
    String[] processorList, memoryList, storageList, caseList;
    String order;
    public MacOrderCommand(Assembler assembler, String order, String[]processorList, String[] memoryList, String[] storageList,String[] caseList){
        this.assembler = assembler;
        this.order = order;
        this.processorList = processorList;
        this.memoryList = memoryList;
        this.storageList = storageList;
        this.caseList = caseList;
    }

    // MacOrderCommand macOrderCommand = new MacOrderCommand(assembler,macbookProSize,processorArr,memoryArr,storageArr,caseArr);
    public void sendOrder(){
        assembler.macBookProSize = order;
        assembler.processorList = this.processorList;
        assembler.memoryList = this.memoryList;
        assembler.storageList = this.storageList;
        assembler.caseList = this.caseList;

        assembler.sendOrder("Mac");
    }
}

//        assembler.colorList = this.colorList;
//        assembler.appleCareList = this.appleCareList;
