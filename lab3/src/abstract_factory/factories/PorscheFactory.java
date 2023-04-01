package abstract_factory.factories;

import abstract_factory.accessories.Accessories;
import abstract_factory.accessories.PanameraAccessories;
import abstract_factory.cars.Car;
import abstract_factory.cars.Panamera;
import abstract_factory.engines.Engine;
import abstract_factory.engines.PanameraEngine;

public class PorscheFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Panamera();
    }

    @Override
    public Engine createEngine() {
        return new PanameraEngine();
    }

    @Override
    public Accessories createAccessories() {
        return new PanameraAccessories();
    }
}
