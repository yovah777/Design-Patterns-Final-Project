package Mac.MacDecorator;
import Mac.Mac;
/**
 * Represents storage being added to a MacBookPro.
 */
public abstract class StorageDecorator extends Mac {
    /**
     * Returns storage description to user, which type of storage is added.
     * @return
     */
    public abstract String getDescription();
}
