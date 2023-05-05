package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import observer.observers.Observer;

/**
 * Classe base que representa a previsão do tempo, ela implementa a interface
 * Observable e possui os métodos para adicionar, remover e notificar os
 * observadores. Ela também possui os atributos que representam as informações
 * da previsão do tempo. Por fim, ela possui um método que simula a geração de
 * uma previsão do tempo.
 */
public class PrevisaoTempo implements Observable {
    private List<Observer> observers;
    // Map<String, List<Observer>> observers = new HashMap<>();
    private int temperatura;
    private int umidade;
    private boolean chuva;
    private int velocidadeVento;
    private boolean isRunning = false;

    public PrevisaoTempo() {
        this.observers = new ArrayList<>();
    }

    // public PrevisaoTempo (String... operations) { // operations = {"temperature",
    // "humidity", "rainFall", "windSpeed"}
    // for (String operation : operations) {
    // this.observers.put(operation, new ArrayList<>());
    // }
    // }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        // notifyObservers();
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
        // notifyObservers();
    }

    public void setChuva(boolean chuva) {
        this.chuva = chuva;
        // notifyObservers();
    }

    public void setVelocidadeVento(int velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
        // notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // public void addObserver(String observerType, Observer observer) {
    // List<Observer> users = observers.get(observerType);
    // users.add(observer);
    // }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // public void removeObserver(String observerType, Observer observer) {
    // List<Observer> users = observers.get(observerType);
    // users.remove(observer);
    // }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura, umidade, chuva, velocidadeVento);
        }
    }

    // public void notifyObservers(String observerType) {
    // List<Observer> users = observers.get(observerType);
    // for (Observer observer : users) {
    // observer.update(observerType, temperatura, umidade, chuva, velocidadeVento);
    // }
    // }

    // public void notifyObservers() {
    // for (String observerType : observers.keySet()) {
    // List<Observer> users = observers.get(observerType);
    // for (Observer observer : users) {
    // observer.update(observerType, this.temperature, this.humidity, this.rainFall,
    // this.windSpeed);
    // }
    // }
    // }

    public void setMeasurements(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.chuva = chuva;
        this.velocidadeVento = velocidadeVento;
        notifyObservers();
    }

    public void start() {
        Random random = new Random();
        isRunning = true;
        while (isRunning) {
            temperatura = random.nextInt(50);
            umidade = random.nextInt(100);
            chuva = random.nextBoolean();
            velocidadeVento = random.nextInt(100);
            notifyObservers();
            try {
                Thread.sleep(5000); // pausa de 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        isRunning = false;
    }
}
