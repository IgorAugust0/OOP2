package abstract_factory.factories;

import abstract_factory.accessories.Accessories;
import abstract_factory.cars.Car;
import abstract_factory.engines.Engine;

public interface CarFactory {
    Car createCar();

    Engine createEngine();

    Accessories createAccessories();
}
