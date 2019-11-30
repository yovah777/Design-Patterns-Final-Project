package Mac.MacDecorator;
import Mac.Mac;
/**
 * Represents storage being added to a MacBookPro.
 */
public abstract class StorageDecorator extends ComputerDecorator {

    /**
     * Returns storage description to user, which type of storage is added.
     * @return  feature description
     */
    public abstract String getDescription();
}
