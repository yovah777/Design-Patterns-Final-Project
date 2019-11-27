package ProductNotification;

import java.util.Observable;

public class EmailObserver extends Observer {
    public EmailObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("The new product through Email: " + subject.getState());
    }
}
