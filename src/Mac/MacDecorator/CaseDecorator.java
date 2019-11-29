package Mac.MacDecorator;
import Mac.Mac;

/**
 * Specialization of Mac
 * It will help represent the decorator pattern being used.
 * It will display a message to the user that a customized
 * feature is being assembled for them.
 */
public abstract class CaseDecorator extends Mac {
    /**
     * Gets the description of what feature is being added.
     * @return
     */
    public abstract String getDescription();
}
