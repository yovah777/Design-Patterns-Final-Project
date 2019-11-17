import Mac.*;


public class MacFactory {


    public Mac createMac(String macBookProSize)
    {
        if (macBookProSize.equals(null)){
            return null;
        } else if(macBookProSize.equalsIgnoreCase("MacBookPro15")){
            return new MacBookPro15();
        } else if(macBookProSize.equalsIgnoreCase("MacBookPro13")){
            return new MacBookPro13();
        }
        return null;
    }
}
