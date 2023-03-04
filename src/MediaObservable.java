import java.util.ArrayList;
import java.util.List;

public abstract class MediaObservable {
    protected List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String kind,String name) {
        for (Observer observer : observers) {
            observer.update(kind,name);
        }
    }
}