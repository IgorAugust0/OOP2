package abstract_factory.engines;

public class XC90Engine implements Engine {

    @Override
    public void start() {
        System.out.println("Produzindo motor de Volvo XC90");
    }
}
