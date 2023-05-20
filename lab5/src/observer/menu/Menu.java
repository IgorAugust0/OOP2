package observer.menu;

import java.util.Scanner;

import observer.observers.Aeroporto;
import observer.observers.Agricultor;
import observer.observers.Jornal;
import observer.previsao.PrevisaoTempo;

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
                    case 3 -> previsaoTempo.start();
                    case 4 -> {
                        System.out.println("Tem certeza que deseja sair? (S/N)");
                        String resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("S")) {
                            System.out.println("Até mais!");
                            System.exit(0);
                        }
                    }
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }
}
