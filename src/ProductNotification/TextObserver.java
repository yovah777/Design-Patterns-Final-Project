package ProductNotification;

public class TextObserver extends Observer{
    public TextObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("The new product through Text: " + subject.getState());
    }
}
