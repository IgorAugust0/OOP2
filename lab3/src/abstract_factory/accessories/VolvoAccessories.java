package abstract_factory.accessories;

public class VolvoAccessories implements Accessories {
    @Override
    public void add() {
        System.out.println("Adicionando acessório Volvo\n");
    }
}
