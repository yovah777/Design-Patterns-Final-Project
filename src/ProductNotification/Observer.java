package ProductNotification;

/**
 * Represents Subscriber and contains update method for notifications.
 */
public abstract class Observer {
    /**
     * Has an interesting state is often called subject, it’s going to notify other objects about the new notifications.
     */
    protected Subject subject;
    /**
     * Alerts about changes (notifications of specials)
     */
    public abstract void update();
}
