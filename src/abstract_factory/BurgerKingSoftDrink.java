package abstract_factory;

class BurgerKingSoftDrink implements  SoftDrink {
    private final String NAME = "Soft Drink from Burger King";
    @Override
    public String getName() {
        return NAME;
    }
}
