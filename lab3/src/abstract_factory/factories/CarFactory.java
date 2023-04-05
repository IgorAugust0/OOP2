package abstract_factory.factories;

import abstract_factory.accessories.Accessories;
import abstract_factory.cars.Car;
import abstract_factory.engines.Engine;

/**
 * Interface CarFactory
 * 
 * Define os métodos que serão implementados pelas classes que a implementam.
 * 
 * A interface define os métodos createCar, createEngine e createAccessories que
 * serão implementados pelas classes que a implementam.
 * 
 * A interface CarFactory é uma das interfaces que compõem o Abstract Factory.
 */
public interface CarFactory {
    Car createCar();

    Engine createEngine();

    Accessories createAccessories();
}

/**
 * Uma forma alternativa seria utilizando generics ("T"), porém não tenho
 * certeza se seria a melhor opção para abstract factory.
 * 
 * public interface CarFactory <T extends Car> {
 * T createCar();
 * 
 * Engine createEngine();
 * 
 * Accessories createAccessories();
 * }
 */