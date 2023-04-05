package abstract_factory;

import java.util.ArrayList;
import java.util.List;

import abstract_factory.factories.*;

/**
 * Classe Demo que cria uma lista de objetos Application e adiciona a cada um
 * deles uma fábrica de carros.
 * 
 * A classe Demo é a classe que contém o método main e é responsável por criar
 * uma lista de objetos Application e
 * adicionar a cada um deles uma fábrica de carros.
 */
public class Demo {
    private static List<Application> configApplication() {
        List<Application> apps = new ArrayList<>();
        CarFactory factories[] = { new VolvoFactory(), new MercedesFactory(), new PorscheFactory() };
        for (CarFactory factory : factories) {
            Application app = new Application(factory);
            apps.add(app);
        }
        return apps;
    }

    public static void main(String[] args) {
        List<Application> apps = configApplication();
        for (Application app : apps) {
            app.drive();
            app.start();
            app.add();
        }
    }
}
