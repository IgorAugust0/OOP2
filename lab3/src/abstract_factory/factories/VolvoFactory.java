package abstract_factory.factories;

import abstract_factory.accessories.Accessories;
import abstract_factory.accessories.XC90Accessories;
import abstract_factory.cars.Car;
import abstract_factory.cars.XC90;
import abstract_factory.engines.Engine;
import abstract_factory.engines.XC90Engine;

public class VolvoFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new XC90();
    }

    @Override
    public Engine createEngine() {
        return new XC90Engine();
    }

    @Override
    public Accessories createAccessories() {
        return new XC90Accessories();
    }
}
