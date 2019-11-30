package ProductNotification;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * Represents the Publisher of events (notifications) to client(s) (customer).
 * Subscription management
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    /**
     * A new notification/special
     */
    private String state;

    /**
     * Retrieves current notification
     * @return current notification
     */
    public String getState() {
        return state;
    }
    /**
     * Notifies observers of current state.
     * @param state current state
     */
    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * Adds observers to list
     * @param observer  Represents subscriber(either email or text)
     */
    public void attach(Observer observer){
        observers.add(observer);
    }
    /**
     * When a new notification is created, Subject goes over subscription list
     * and calls notification method.
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
