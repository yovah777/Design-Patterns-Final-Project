package Mac.MacDecorator;
import Mac.Computer;

/**
 * Represents abstraction of Decorator features used for Macbooks.
 */
public abstract class ComputerDecorator extends Computer {
    /**
     * Informs user of specific feature that has been added.
     * @return description of feature added
     */
    public abstract String getDescription();
}
