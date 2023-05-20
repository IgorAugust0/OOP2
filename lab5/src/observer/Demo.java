package observer;

import observer.menu.Menu;

/**
 * Classe principal do programa que exibe o menu e permite a interação com o usuário
 */
public class Demo {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
