package main.iphone;

public class Iphone11Standard extends Iphone11 {

    @Override
    public double cost(){
        return 699.00;
    }

    @Override
    public String getDescription() {
        return "Iphone 11 Standard Max 6.1\" display ";
    }

    public void getHardware(){
        System.out.println("Adding Glass and aluminum material...");
        System.out.println("Adding 2 camera to phone..." );
        System.out.println("Adding Liquid Retina HD display...");
    }
}

