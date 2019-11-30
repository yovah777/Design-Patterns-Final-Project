package Mac.MacDecorator;
import Mac.Mac;

/**
 * Represents memory being added to a MacBookPro.
 */
public abstract class MemoryDecorator extends ComputerDecorator {
    /**
     * Returns memory description to user, which type of memory is added.
     * @return
     */

    public abstract String getDescription();
}
