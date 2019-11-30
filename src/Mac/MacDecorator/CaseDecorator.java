package Mac.MacDecorator;

/**
 * Specialization of Mac
 * It will represent the decorator pattern being used.
 * It will also display a message to the user that a custom case
 * feature has been assembled for them.
 */
public abstract class CaseDecorator extends ComputerDecorator {
    /**
     * Gets the description of what feature is being added.
     * @return
     */
    public abstract String getDescription();
}
