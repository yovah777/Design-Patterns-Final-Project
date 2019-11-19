package main;

import main.iphone.*;


public class IphoneFactory {
    public Iphone makePhone(String iphoneModel) {
        if (iphoneModel.equals(null)){
            return null;
        } else if(iphoneModel.equals("Iphone11Pro")){
            return new Iphone11Pro();
        } else if(iphoneModel.equals("Iphone11Standard")){
            return new Iphone11Standard();
        } else if(iphoneModel.equals("IphoneXR")){
//            return new IphoneXR();
            return new Iphone11Pro();
        } else if(iphoneModel.equals("Iphone8")){
//            return new Iphone8();
            return new Iphone11Pro();
        } else {
            return null;
        }
    }
}
