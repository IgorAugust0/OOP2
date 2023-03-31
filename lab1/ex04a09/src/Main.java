import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    // Optei por utilizar o java.time pois é mais moderno e o Date está depreciado.
    public static LocalDateTime calcularProximaOlimpiada() {
        LocalDateTime agora = LocalDateTime.now(); // Data e hora atual
        LocalDateTime proximaOlimpiada = LocalDateTime.of(2024, Month.JULY, 26, 0, 0);
        System.out.println("Faltam " + ChronoUnit.DAYS.between(agora, proximaOlimpiada) + " dias para a próxima Olimpíada");
        return proximaOlimpiada;
    }

    public static void main(String[] args) {

        // Criando um array de objetos da classe Atleta
        Atleta atletas[] = new Atleta[3];
        atletas[0] = new Tenista("Novak Djokovic", 34, "Masculino", 85.0, 1.85, "Grand Slam", "1h 30min", "1");
        atletas[1] = new Futebolista("Messi", 32, "Masculino", 72.0, 1.70, "Atacante", 30, "PSG");
        atletas[2] = new Corredor("Usain Bolt", 34, "Masculino", 80.0, 1.90, "100m", "10s");

        // Criando uma lista de arrays da classe Atleta
        ArrayList<Atleta> atletasList = new ArrayList<Atleta>();
        atletasList.add(new Tenista("Roger Federer", 39, "Masculino", 85.0, 1.85, "Grand Slam", "1h 30min", "2"));
        atletasList.add(new Futebolista("Cristiano Ronaldo", 36, "Masculino", 72.0, 1.70, "Atacante", 30, "Juventus"));
        atletasList.add(new Corredor("Mo Farah", 38, "Masculino", 80.0, 1.90, "100m", "10s"));

        // Comparando o nome dos atletas em ordem alfabética usando o método compareTo()
        Comparador cls = new Comparador();
        cls.ordena(atletas);
        cls.ordena(atletasList);

        // Imprimindo os dados dos atletas do array
        for (int i = 0; i < atletas.length; i++) {
            // atletas[i].print();
            atletas[i].imprime();
            atletas[i].aquecer(5);
            atletas[i].jogar();
            System.out.print("\n");
        }

        // Imprimindo os dados dos atletas da lista de arrays
        for (Atleta as : atletasList) {
            // as.print();
            as.imprime();
            as.aquecer(10);
            as.jogar();
            System.out.print("\n");
        }

        // Imprimindo o tempo restante para a próxima Olimpíada
        calcularProximaOlimpiada();
    }
}
