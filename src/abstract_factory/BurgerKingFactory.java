package abstract_factory;

class BurgerKingFactory implements  FastFoodFactory {
    @Override
    public Burger createBurger() {
        return new BurgerKingBurger();
    }

    @Override
    public SoftDrink createSoftDrink() {
        return new BurgerKingSoftDrink();
    }
}
