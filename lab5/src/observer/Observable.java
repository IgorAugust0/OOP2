package observer;

import observer.observers.Observer;

/**
 * Interface que define os métodos necessários para um objeto ser observável.
 */
public interface Observable {
    void addObserver(Observer observer);
    // void addObserver(String observerName, Observer observer);
    void removeObserver(Observer observer);
    // void removeObserver(String observerName, Observer observer);
    void notifyObservers();
}
