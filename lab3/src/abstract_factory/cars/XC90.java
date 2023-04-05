package abstract_factory.cars;

/**
 * Classe que implementa a interface Car e define o método drive para produzir
 * um Volvo XC90.
 * 
 * A classe XC90 é uma das classes concretas que implementam a interface Car.
 */
public class XC90 implements Car {
    @Override
    public void drive() {
        System.out.println("Produzindo um Volvo XC90");
    }
}
