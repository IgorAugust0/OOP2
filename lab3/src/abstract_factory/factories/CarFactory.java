package abstract_factory.factories;

import abstract_factory.accessories.Accessories;
import abstract_factory.cars.Car;
import abstract_factory.engines.Engine;

public interface CarFactory {
    Car createCar();

    Engine createEngine();

    Accessories createAccessories();
}

/**
 * Uma forma alternativa seria utilizando generics ("T"), porém não tenho
 * certeza de que se seria a melhor opção para abstract factory.
 * 
 * public interface CarFactory <T extends Car> {
 * T createCar();
 * 
 * Engine createEngine();
 * 
 * Accessories createAccessories();
 * }
 */