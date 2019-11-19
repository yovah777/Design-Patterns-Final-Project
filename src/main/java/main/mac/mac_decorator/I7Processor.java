package main.mac.mac_decorator;

import main.mac.Mac;

public class I7Processor extends ProcessorDecorator{

    Mac mac;

    public I7Processor(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 100.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", I7 processor";
    }
}
