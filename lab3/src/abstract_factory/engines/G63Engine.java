package abstract_factory.engines;

public class G63Engine implements Engine {

    @Override
    public void start() {
        System.out.println("Produzindo motor de Mercedes");
    }
}
