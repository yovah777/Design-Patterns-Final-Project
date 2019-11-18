import Iphone.*;

/**
 * Represents a factory that will build Iphone models.
 * Iphone11Standard and Iphone11Pro are created here.
 */
public class IphoneFactory {
    /**
     * Creates a specific model of Iphone.
     * @param iphoneModel   Specific type.
     * @return
     */
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
