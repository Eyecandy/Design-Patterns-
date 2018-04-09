package builder;

import java.util.logging.Logger;

/**
 * Builder Pattern: Separate the construction of a complex object from its representation
 * so that the same construction process can create different representations.
 *
 * useful when creating complex object consisting of multiple components.
 * finer control over the construction process, step by step creation.
 *
 * The Sandwich Set is the object we wish to build.
 */
public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args)  {
        Main main = new Main();
        main.createSandwichSets();;
    }
    private void createSandwichSets()  {
        SandwichSet kidsSet = new SandwichSet.SandwichSetBuilder().withBread(Bread.PARMESAN).
                withChese(Cheese.BRIE).withCookie(Cookie.CHOCOLATE_CHIP).
                withMeat(Meat.CHICKEN_BREAST).withDrink(Drink.ORANGE_JUICE).build();

        LOGGER.info(kidsSet.content());


        SandwichSet setOfTheDay = new SandwichSet.SandwichSetBuilder().withBread(Bread.OREGANO).
                withChese(Cheese.GOUDA).withCookie(Cookie.TOFFE_NUT)
                .withMeat(Meat.ROAST_BEEF).withDrink(Drink.COKE).withVegtables(Vegetable.values()).build();

        LOGGER.info(setOfTheDay.content());



    }
}
