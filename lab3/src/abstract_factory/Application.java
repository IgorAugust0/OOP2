package abstract_factory;

import abstract_factory.accessories.Accessories;
import abstract_factory.cars.Car;
import abstract_factory.engines.Engine;
import abstract_factory.factories.CarFactory;

/**
 * Classe Application que utiliza a interface CarFactory para criar um carro, um 
 * motor e acessórios para o carro.
 * 
 * Possui um método drive que utiliza o método drive da classe Car, um método 
 * start que utiliza o método start da classe Engine e um método add que utiliza
 * o método add da classe Accessories.
 * 
 */
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
