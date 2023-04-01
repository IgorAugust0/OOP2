package abstract_factory;

import abstract_factory.accessories.Accessories;
import abstract_factory.cars.Car;
import abstract_factory.engines.Engine;
import abstract_factory.factories.CarFactory;

public class Application {
    private Car car;
    private Engine engine;
    private Accessories accessories;

    public Application(CarFactory factory) {
        car = factory.createCar();
        engine = factory.createEngine();
        accessories = factory.createAccessories();
    }

    public void drive() {
        car.drive();
    }

    public void start() {
        engine.start();
    }

    public void add() {
        accessories.add();
    }
}
