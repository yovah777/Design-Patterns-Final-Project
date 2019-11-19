package main.iphone;

public class Iphone11Pro extends Iphone11 {

    @Override
    public double cost(){
        return 999.00;
    }

    @Override
    public String getDescription() {
        return "Iphone 11 Pro 5.8\" display ";
    }

    public void getHardware(){
        System.out.println("Adding Textured matte glass and stainless steel ...");
        System.out.println("Adding 3 camera to phone..." );
        System.out.println("Adding Super Retina XDR display...");
    }



}



