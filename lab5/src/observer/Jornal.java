package observer;


/**
 * Observador que exibe as informações da previsão do tempo de forma específica para jornal
 */
public class Jornal implements Observer {
    @Override
    public void update(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        System.out.println("Notícias do dia: A temperatura é de " + temperatura + " graus e a umidade é de " + umidade + "%. " + (chuva ? "Há chuva prevista." : "Não há previsão de chuva."));
    }
}
