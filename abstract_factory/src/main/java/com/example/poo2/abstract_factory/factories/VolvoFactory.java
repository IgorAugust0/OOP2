package com.example.poo2.abstract_factory.factories;

import com.example.poo2.abstract_factory.accessories.Accessories;
import com.example.poo2.abstract_factory.accessories.XC90Accessories;
import com.example.poo2.abstract_factory.cars.Car;
import com.example.poo2.abstract_factory.cars.XC90;
import com.example.poo2.abstract_factory.engines.Engine;
import com.example.poo2.abstract_factory.engines.XC90Engine;

/**
 * Classe que implementa a interface CarFactory e define os métodos createCar,
 * createEngine e createAccessories para criar um carro da marca Volvo.
 * 
 * A classe VolvoFactory é uma das classes concretas que implementam a
 * interface CarFactory.
 */
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
