package main.mac;

public abstract class Mac {
    String description = "";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void packagingMacBookOrder(String type){
        System.out.println("Packaging" + type + " order");
    }

    public void shipMacBookOrder(String type){
        System.out.println("Shipping" + type + " order");
    }
}
