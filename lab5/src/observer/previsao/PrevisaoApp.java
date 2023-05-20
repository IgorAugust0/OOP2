package observer.previsao;

import observer.util.Observer;
import observer.util.ObserverType;

/**
 * Classe de teste (não utilizada no programa principal)
 */
public class PrevisaoApp implements Observer {
    private ObserverType observerType;

    public PrevisaoApp(ObserverType observerType) {
        this.observerType = observerType;
    }

    @Override
    public void update(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        switch (observerType) {
            case JORNAL -> System.out.println("Jornal: " + temperatura + "ºC, " + umidade + "%, "
                    + (chuva ? "Chuva" : "Sem chuva") + ", " + velocidadeVento + "km/h");
            case AEROPORTO -> System.out.println("Aeroporto: " + temperatura + "ºC, " + umidade + "%, "
                    + (chuva ? "Chuva" : "Sem chuva") + ", " + velocidadeVento + "km/h");
            case AGRICULTOR -> System.out.println("Agricultor: " + temperatura + "ºC, " + umidade + "%, "
                    + (chuva ? "Chuva" : "Sem chuva") + ", " + velocidadeVento + "km/h");
            default -> System.out.println("Tipo de observador inválido");
        }
    }
}
