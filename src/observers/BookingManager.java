package observers;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void newBooking(String tour) {
        System.out.println("New booking confirmed for: " + tour);
        notifyObservers("Booking confirmed for: " + tour);
    }
}
