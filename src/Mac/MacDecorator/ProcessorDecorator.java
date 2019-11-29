package Mac.MacDecorator;
import Mac.Mac;

/**
 * Represents processor that will be added to MacBookPro
 */
public abstract class ProcessorDecorator extends Mac {
    /**
     * Returns description of what type of processor is added.
     * @return
     */
    public abstract String getDescription();
}
