package abstract_factory.engines;

/**
 * Classe que implementa a interface Engine e define o método start para produzir
 * um motor de Mercedes.
 * 
 * A classe G63Engine é uma das classes concretas que implementam a interface Engine.
 */
public class G63Engine implements Engine {

    @Override
    public void start() {
        System.out.println("Produzindo motor de Mercedes");
    }
}
