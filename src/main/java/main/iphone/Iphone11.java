package main.iphone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Using template pattern
public abstract class Iphone11 implements Iphone {
    public abstract double cost();
    public abstract String getDescription();

    // TEMPLATE METHOD
    @Override
    public void implementIphone(){
        designIphone();
        prepareIOSsoftware();
        getHardware();

        if (customerWantsEngraving()){
            addEngraving();
        }
    }

    public void designIphone(){
        System.out.println("Designing new iPhone..." );
    }

    public void prepareIOSsoftware(){
        System.out.println("Adding new IOS into iPhone..." );
    }

    public abstract void getHardware();

    public void addEngraving(){
        System.out.println("Adding customized engraving to device..." );
    }


    // Hook method for iPhone
    public boolean customerWantsEngraving(){
        String engravingName = getEngravingName();

        if(engravingName.toLowerCase().startsWith("y")) {
            return true;
        }else{
            return false;
        }
    }

    private String getEngravingName(){
        String customerResponse = null;
        System.out.println("Would you like to add an engraving name to your Apple device? y/n");

        BufferedReader engravingName = new BufferedReader(new InputStreamReader(System.in));

        try{
            customerResponse = engravingName.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(customerResponse == null){
            customerResponse = "no";
        }
        return customerResponse;
    }
}
