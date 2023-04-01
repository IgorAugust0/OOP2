package abstract_factory;

import java.util.ArrayList;
import java.util.List;

import abstract_factory.factories.*;

public class Demo {
    private static List<Application> configApplication() {
        List<Application> apps = new ArrayList<>();
        CarFactory factories[] = {new VolvoFactory(), new MercedesFactory(), new PorscheFactory()};
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
