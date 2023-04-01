package abstract_factory.engines;

public class VolvoEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Produzindo motor de Volvo.");
    }
}
