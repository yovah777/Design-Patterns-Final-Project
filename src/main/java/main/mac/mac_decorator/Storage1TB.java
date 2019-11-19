package main.mac.mac_decorator;

import main.mac.Mac;

public class Storage1TB extends StorageDecorator{

    Mac mac;

    public Storage1TB(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 600.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", 1TB of Storage";
    }
}
