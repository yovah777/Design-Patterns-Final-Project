package ProductNotification;
import java.util.Observable;

/**
 * Represents a concrete subscriber
 * Email representation of a notification.
 */
public class EmailObserver extends Observer {
    /**
     * Email notification
     * @param subject notification that will be sent to email
     */
    public EmailObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("The new product through Email: " + subject.getState());
    }
}
