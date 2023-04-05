package abstract_factory.accessories;

/**
 * Classe que implementa a interface Accessories e define o método add para
 * adicionar um acessório de Volvo XC90.
 * 
 * A classe XC90Accessories é uma das classes concretas que implementam a
 * interface Accessories.
 */
public class XC90Accessories implements Accessories {
    @Override
    public void add() {
        System.out.println("Adicionando acessório de Volvo XC90\n");
    }
}
