package observer;

import java.util.Scanner;

/**
 * Classe menu que exibe o menu e permite a interação com o usuário para
 * adicionar e remover observadores e executar a previsão do tempo
 */
public class Menu {
    private final PrevisaoTempo previsaoTempo;
    private final Jornal jornal;
    private final Aeroporto aeroporto;
    private final Agricultor agricultor;

    public Menu() {
        previsaoTempo = new PrevisaoTempo();
        jornal = new Jornal();
        aeroporto = new Aeroporto();
        agricultor = new Agricultor();
        previsaoTempo.addObserver(jornal);
        previsaoTempo.addObserver(aeroporto);
        previsaoTempo.addObserver(agricultor);
    }

    private void adicionarObservador(Scanner scanner) {
        System.out.println("""
                Escolha um Observador:
                1 - Jornal
                2 - Aeroporto
                3 - Agricultor
                """);
        int observador = scanner.nextInt();
        switch (observador) {
            case 1 -> previsaoTempo.addObserver(jornal);
            case 2 -> previsaoTempo.addObserver(aeroporto);
            case 3 -> previsaoTempo.addObserver(agricultor);
            default -> {
            }
        }
    }

    private void removerObservador(Scanner scanner) {
        System.out.println("""
                Escolha um Observador a ser removido:
                1 - Jornal
                2 - Aeroporto
                3 - Agricultor
                """);
        int observadorRemover = scanner.nextInt();
        switch (observadorRemover) {
            case 1 -> previsaoTempo.removeObserver(jornal);
            case 2 -> previsaoTempo.removeObserver(aeroporto);
            case 3 -> previsaoTempo.removeObserver(agricultor);
            default -> {
            }
        }
    }

    public void exibirMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao = 0;

            while (opcao != 4) {
                System.out.println("""
                        Escolha uma opção:
                        1 - Adicionar Observador
                        2 - Remover Observador
                        3 - Executar
                        4 - Sair
                        """);
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> adicionarObservador(scanner);
                    case 2 -> removerObservador(scanner);
                    case 3 -> { // parar a execução não está funcionando, somente a execução em si
                        previsaoTempo.start();
                        boolean executionRunning = true;
                        while (executionRunning) {
                            System.out.println("""
                                    Escolha uma opção:
                                    1 - Parar Execução
                                    2 - Voltar ao Menu
                                    """);
                            int subOpcao = scanner.nextInt();
                            switch (subOpcao) {
                                case 1 -> {
                                    previsaoTempo.stop();
                                    executionRunning = false;
                                }
                                case 2 -> {
                                    previsaoTempo.stop();
                                    executionRunning = false;
                                    opcao = 0;
                                }
                                default -> System.out.println("Opção inválida.");
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("Tem certeza que deseja sair? (S/N)");
                        String resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("S")) {
                            previsaoTempo.stop();
                        }
                    }
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }
}

// import java.util.ArrayList;
// import java.util.InputMismatchException;
// import java.util.List;

// public class Menu {
// private PrevisaoTempo previsaoTempo;
// private final List<PrevisaoTempo> observers = new ArrayList<>();

// public void setPrevisaoTempo(PrevisaoTempo previsaoTempo) {
// this.previsaoTempo = previsaoTempo;
// }

// public void registerObserver(PrevisaoApp observer) {
// observers.add(observer);
// }

// public void removeObserver(PrevisaoApp observer) {
// observers.remove(observer);
// }

// public void display() {
// try (Scanner scanner = new Scanner(System.in)) {
// String menu = """
// Welcome to the Weather Station!
// What would you like to do?
// 1. Add a new weather reading
// 2. Remove a weather reading
// 3. Display all weather readings
// 4. Quit
// """;
// System.out.println(menu);

// int choice = scanner.nextInt();

// switch (choice) {
// case 1 -> {
// double temperature = getDoubleInput("Enter the temperature: ");
// double humidity = getDoubleInput("Enter the humidity: ");
// double pressure = getDoubleInput("Enter the pressure: ");
// previsaoTempo.addReading(new PrevisaoTempo(temperature, humidity, pressure));
// notifyObservers();
// display();
// }
// case 2 -> {
// int index = getIntInput("Enter the index of the reading to remove: ");
// previsaoTempo.removeReading(index);
// notifyObservers();
// display();
// }
// case 3 -> {
// System.out.println(weatherStation);
// display();
// }
// case 4 -> System.out.println("Goodbye!");
// default -> {
// System.out.println("Invalid choice. Please try again.");
// display();
// }
// }
// }
// }

// private void notifyObservers() {
// observers.forEach(observer -> observer.update(previsaoTempo));
// }

// private double getDoubleInput(String message) {
// Scanner scanner = new Scanner(System.in);
// while (true) {
// System.out.print(message);
// try {
// double input = scanner.nextDouble();
// scanner.nextLine(); // consume the newline character
// return input;
// } catch (InputMismatchException e) {
// scanner.nextLine(); // consume the invalid input
// System.out.println("Invalid input. Please enter a valid decimal number.");
// }
// }
// }

// private int getIntInput(String message) {
// Scanner scanner = new Scanner(System.in);
// while (true) {
// System.out.print(message);
// try {
// int input = scanner.nextInt();
// scanner.nextLine(); // consume the newline character
// return input;
// } catch (InputMismatchException e) {
// scanner.nextLine(); // consume the invalid input
// System.out.println("Invalid input. Please enter a valid integer.");
// }
// }
// }

// }
