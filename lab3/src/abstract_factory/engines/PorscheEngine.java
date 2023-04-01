package abstract_factory.engines;

public class PorscheEngine implements Engine {
    
    @Override
    public void start() {
        System.out.println("Produzindo motor de Porsche.");
    }
}
