package observer;

/**
 * Interface que define o comportamento de um observador.
 */
public interface Observer {
    void update(int temperatura, int umidade, boolean chuva, int velocidadeVento);
    // void update(String observerType, float temperature, float humidity, boolean rainFall, float windSpeed);
}