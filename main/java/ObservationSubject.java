import java.util.ArrayList;
import java.util.List;

public abstract class ObservationSubject implements Observer{
    private List<Observer> observers = new ArrayList<>();
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String lightColor, int time) {
        for (Observer observer : observers) {

            observer.update(lightColor);
        }
    }

}
