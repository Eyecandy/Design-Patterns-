package abstract_factory;

public class BurgerKingBurger implements  Burger {

    private final String NAME= "Burger king's Burger";

    @Override
    public String getName() {
        return NAME;
    }


}
