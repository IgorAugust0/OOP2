package abstract_factory.factories;

import abstract_factory.accessories.Accessories;
import abstract_factory.accessories.G63Accessories;
import abstract_factory.cars.G63;
import abstract_factory.cars.Car;
import abstract_factory.engines.Engine;
import abstract_factory.engines.G63Engine;

/**
 * Classe que implementa a interface CarFactory e define os métodos createCar,
 * createEngine e createAccessories para criar um carro da marca Mercedes.
 * 
 * A classe MercedesFactory é uma das classes concretas que implementam a
 * interface CarFactory.
 */
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
