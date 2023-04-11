package com.example.poo2.abstract_factory.factories;

import com.example.poo2.abstract_factory.accessories.Accessories;
import com.example.poo2.abstract_factory.accessories.PanameraAccessories;
import com.example.poo2.abstract_factory.cars.Car;
import com.example.poo2.abstract_factory.cars.Panamera;
import com.example.poo2.abstract_factory.engines.Engine;
import com.example.poo2.abstract_factory.engines.PanameraEngine;

/**
 * Classe que implementa a interface CarFactory e define os métodos createCar,
 * createEngine e createAccessories para criar um carro da marca Porsche.
 * 
 * A classe PorscheFactory é uma das classes concretas que implementam a
 * interface CarFactory.
 */
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
