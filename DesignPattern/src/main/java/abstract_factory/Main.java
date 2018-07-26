package abstract_factory;

import java.util.logging.Logger;

/**
 * Creational Design Pattern
 */

class Main {
    private static final Logger LOGGER = Logger.getLogger(abstract_factory.Main.class.getName());
    public static void main(String[] args) {
        FastFoodFactory mcDonaldsFactory= FactoryInstansiater.createFactory(FactoryType.MCDONALDS);
        Burger mcdonaldsBurger = mcDonaldsFactory.createBurger();
        SoftDrink mcDonaldsSoftDrink= mcDonaldsFactory.createSoftDrink();
        LOGGER.info("created a " + mcdonaldsBurger.getName() + "and a " + mcDonaldsSoftDrink.getName());

        FastFoodFactory burgerKingFactory = FactoryInstansiater.createFactory(FactoryType.BURGER_KING);
        Burger burgerKingBurger = burgerKingFactory.createBurger();
        SoftDrink burgerKingSoftDrink = burgerKingFactory.createSoftDrink();
        LOGGER.info("created a "+ burgerKingBurger.getName() + " and a "+ burgerKingSoftDrink.getName());


    }

}
