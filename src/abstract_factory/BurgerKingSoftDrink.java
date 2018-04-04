package abstract_factory;

public class BurgerKingSoftDrink implements  SoftDrink {
    private final String NAME = "Soft Drink from Burger King";
    @Override
    public String getName() {
        return NAME;
    }
}
