package abstract_factory.factories;

import abstract_factory.accessories.Accessories;
import abstract_factory.accessories.MercedesAccessories;
import abstract_factory.cars.G63;
import abstract_factory.cars.Car;
import abstract_factory.engines.Engine;
import abstract_factory.engines.MercedesEngine;

public class MercedesFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new G63();
    }

    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }

    @Override
    public Accessories createAccessories() {
        return new MercedesAccessories();
    }
}
