package observer.observers;

/**
 * Observador que exibe as informações da previsão do tempo de forma específica para agricultores
 */
public class Agricultor implements Observer {
    @Override
    public void update(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        System.out.println("Agricultura: As condições do tempo são ideais para as plantações.");
    }
}
