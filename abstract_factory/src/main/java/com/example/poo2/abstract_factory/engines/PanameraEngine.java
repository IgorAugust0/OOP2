package com.example.poo2.abstract_factory.engines;

/**
 * Classe que implementa a interface Engine e define o método start para produzir
 * um motor de Porsche.
 * 
 * A classe PanameraEngine é uma das classes concretas que implementam a interface Engine.
 */
public class PanameraEngine implements Engine {
    
    @Override
    public void start() {
        System.out.println("Produzindo motor de Porsche Panamera");
    }
}
