package main.mac.mac_decorator;

import main.mac.Mac;

public class Storage512GB extends StorageDecorator{

    Mac mac;

    public Storage512GB(Mac mac){
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 400.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", 512GB of Storage";
    }
}
