package ProductNotification;
/**
 * Represents a concrete subscriber
 * Text messaging representation of a notification.
 */
public class TextObserver extends Observer{
    /**
     * Textmessage
     * @param subject  message/notification sent by text
     */
    public TextObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("The new product through Text: " + subject.getState());
    }
}
