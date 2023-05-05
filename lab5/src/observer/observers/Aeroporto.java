package observer.observers;

/**
 * Observador que exibe as informações da previsão do tempo de forma específica para aeroporto
 */
public class Aeroporto implements Observer {
    @Override
    public void update(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        System.out.println("Aviso de aeroporto: A velocidade do vento é de " + velocidadeVento + " km/h.");
    }
}
