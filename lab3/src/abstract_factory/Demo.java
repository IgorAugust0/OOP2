package abstract_factory;

import java.util.ArrayList;
import java.util.List;

import abstract_factory.factories.*;

public class Demo {
    private static List<Application> configApplication() {
        List<Application> apps = new ArrayList<>();
        CarFactory factory[] = new CarFactory[3];
        factory[0] = new VolvoFactory();
        factory[1] = new MercedesFactory();
        factory[2] = new PorscheFactory();
        for (CarFactory carFactory : factory) {
            Application app = new Application(carFactory);
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
