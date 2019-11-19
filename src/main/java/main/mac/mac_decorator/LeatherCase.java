package main.mac.mac_decorator;

import main.mac.Mac;

public class LeatherCase extends CaseDecorator{

    Mac mac;

    public LeatherCase(Mac mac) {
        this.mac = mac;
    }

    @Override
    public double cost(){
        return 79.00 + mac.cost();
    }

    @Override
    public String getDescription(){
        return mac.getDescription() + ", Leather Case ";
    }
}
