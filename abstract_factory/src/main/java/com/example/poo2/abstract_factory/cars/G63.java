package com.example.poo2.abstract_factory.cars;

/**
 * Classe que implementa a interface Car e define o método drive para produzir
 * uma Mercedes G63 AMG.
 * 
 * A classe G63 é uma das classes concretas que implementam a interface Car.
 */
public class G63 implements Car {
    @Override
    public void drive() {
        System.out.println("Produzindo uma Mercedes G63 AMG");
    }

}
