package abstract_factory.accessories;

/**
 * Classe que implementa a interface Accessories e define o método add para
 * adicionar um acessório de Mercedes G63.
 * 
 * A classe G63Accessories é uma das classes concretas que implementam a
 * interface Accessories.
 */
public class G63Accessories implements Accessories {
    @Override
    public void add() {
        System.out.println("Adicionando acessório de Mercedes G63\n");
    }
}
