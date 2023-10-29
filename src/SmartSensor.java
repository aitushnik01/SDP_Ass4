import Interfaces.Observer;
import Interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class SmartSensor implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for(Observer observer : observers) {
            observer.update(event) ;
        }
    }
}
