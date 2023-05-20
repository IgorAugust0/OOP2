package observer.previsao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import observer.util.Observable;
import observer.util.Observer;

/**
 * Classe base que representa a previsão do tempo, ela implementa a interface
 * Observable e possui os métodos para adicionar, remover e notificar os
 * observadores. Ela também possui os atributos que representam as informações
 * da previsão do tempo. Por fim, ela possui um método que simula a geração de
 * uma previsão do tempo.
 */
public class PrevisaoTempo implements Observable {
    private List<Observer> observers;
    private int temperatura;
    private int umidade;
    private boolean chuva;
    private int velocidadeVento;

    public PrevisaoTempo() {
        this.observers = new ArrayList<>();
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
    }

    public void setChuva(boolean chuva) {
        this.chuva = chuva;
    }

    public void setVelocidadeVento(int velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura, umidade, chuva, velocidadeVento);
        }
    }

    public void setMeasurements(int temperatura, int umidade, boolean chuva, int velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.chuva = chuva;
        this.velocidadeVento = velocidadeVento;
        notifyObservers();
    }

    /**
     * Método que simula a geração de uma previsão do tempo, ele gera valores
     * aleatórios para as variáveis de previsão do tempo e notifica os observadores
     * a cada 5 segundos
     */
    public void start() {
        Random random = new Random(); // Cria um objeto Random para gerar valores aleatórios

        // operação variáveis atômicas para controlar o número de iterações, tendo como
        // finalidade garantir a consistência e a corretude das operações realizadas na
        // variável, mesmo em um ambiente de concorrência
        final AtomicInteger iteracoesRestantes = new AtomicInteger(5); // define o número de iterações (5)

        // Cria um executor de uma thread que executa a cada 5 segundos, é executado
        // atomicamente, sem a interferência de outras threads
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() -> {
            // pega o número de iterações restantes e decrementa em 1
            int iteracoesAtuais = iteracoesRestantes.getAndDecrement();
            if (iteracoesAtuais <= 0) {
                // Se o número de iterações for menor ou igual a 0, encerra o programa
                executor.shutdown();
                System.out.println("Encerrando o programa...");
                System.exit(0);
                return;
            }

            // Gerando valores aleatórios para as variáveis de previsão do tempo
            temperatura = random.nextInt(50);
            umidade = random.nextInt(100);
            chuva = random.nextBoolean();
            velocidadeVento = random.nextInt(100);
            notifyObservers(); // Notifica os observadores

        }, 0, 5, TimeUnit.SECONDS); // Executa a thread a cada 5 segundos
    }
}
