package abstract_factory.accessories;

/**
 * Classe que implementa a interface Accessories e define o método add para
 * adicionar um acessório de Porsche Panamera.
 * 
 * A classe PanameraAccessories é uma das classes concretas que implementam a
 * interface Accessories.
 */
public class PanameraAccessories implements Accessories {
    @Override
    public void add() {
        System.out.println("Adicionando acessório de Porsche Panamera\n");
    }
}
