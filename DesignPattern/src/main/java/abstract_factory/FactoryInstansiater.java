package abstract_factory;

class FactoryInstansiater {


    public static FastFoodFactory createFactory(FactoryType type) {
        switch(type) {
            case MCDONALDS:
                return new McDonaldsFactory();
            case BURGER_KING:
                return new BurgerKingFactory();
            default:
                throw new IllegalArgumentException("That's not a factory supported");
        }
    }
}
