package Factory;

import Mac.*;

/**
 * Represents the factory that makes the MacBookPros.
 */
public class MacFactory {

    /**
     * Creates a new MacBookPro with a specific size.
     *
     * @param macBookProSize Size is either 13 or 15.
     * @return An object representing either one of these models.
     */
    public Mac createMac(String macBookProSize) {
        if (macBookProSize.equalsIgnoreCase("MacBookPro15")) {
            return new MacBookPro15();
        } else if (macBookProSize.equalsIgnoreCase("MacBookPro13")) {
            return new MacBookPro13();
        }
        return null;
    }
}
