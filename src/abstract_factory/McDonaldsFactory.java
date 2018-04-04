package abstract_factory;

public class McDonaldsFactory  implements FastFoodFactory{
    @Override
    public Burger createBurger() {
        return new McDonaldsBurger();
    }

    @Override
    public SoftDrink createSoftDrink() {
        return new McDonaldsSoftDrink();
    }
}
