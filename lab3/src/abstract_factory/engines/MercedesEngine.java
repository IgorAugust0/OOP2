package abstract_factory.engines;

public class MercedesEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Produzindo motor de Mercedes.");
    }
}
