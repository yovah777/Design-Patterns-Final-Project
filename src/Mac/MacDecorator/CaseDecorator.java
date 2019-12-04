package Mac.MacDecorator;

/**
 * Decorator pattern being used.
 * Will display a message to the user that a custom case
 * feature has been constructed for them.
 */
public abstract class CaseDecorator extends ComputerDecorator {
    /**
     * Gets the description of what feature is being added.
     * @return
     */
    public abstract String getDescription();
}
