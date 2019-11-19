package main.mac.mac_decorator;

import main.mac.Mac;

public class Memory64GB extends MemoryDecorator{

    Mac mac;

    public Memory64GB(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 600.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", 64GB of Memory";
    }
}
