package main.mac.mac_decorator;

import main.mac.Mac;

public class Memory32GB extends MemoryDecorator{

    Mac mac;

    public Memory32GB(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 400.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", 32GB of Memory";
    }
}
