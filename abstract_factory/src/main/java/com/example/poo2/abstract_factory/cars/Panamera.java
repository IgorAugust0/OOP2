package com.example.poo2.abstract_factory.cars;

/**
 * Classe que implementa a interface Car e define o método drive para produzir
 * uma Porsche Panamera.
 * 
 * A classe Panamera é uma das classes concretas que implementam a interface Car.
 */
public class Panamera implements Car {
    @Override
    public void drive() {
        System.out.println("Produzindo uma Porsche Panamera");
    }
}
