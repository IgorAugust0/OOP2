package abstract_factory.factories;

import abstract_factory.accessories.Accessories;
import abstract_factory.accessories.G63Accessories;
import abstract_factory.cars.G63;
import abstract_factory.cars.Car;
import abstract_factory.engines.Engine;
import abstract_factory.engines.G63Engine;

public class MercedesFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new G63();
    }

    @Override
    public Engine createEngine() {
        return new G63Engine();
    }

    @Override
    public Accessories createAccessories() {
        return new G63Accessories();
    }
}
