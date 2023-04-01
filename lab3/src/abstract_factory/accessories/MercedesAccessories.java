package abstract_factory.accessories;

public class MercedesAccessories implements Accessories {
    @Override
    public void add() {
        System.out.println("Adicionando acessório Mercedes\n");
    }
}
