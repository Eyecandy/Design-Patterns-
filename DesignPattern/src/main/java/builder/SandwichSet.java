package builder;
import java.lang.reflect.Field;
import java.util.logging.Logger;

public class SandwichSet {
    /**
     * The SandwichSet default constructor is made private
     * The SandwichSet constructor which takes in a builder
     * sets all the builder attributes with the respective attributes of SandwichSet.
     */

    private Bread bread;
    private Drink drink;
    private Cookie cookie;
    Cheese cheese;
    Meat meat;
    Vegetable[] vegetables;

    private SandwichSet() {}

    public SandwichSet(SandwichSetBuilder builder) {
        this.bread = builder.bread;
        this.drink = builder.drink;
        this.cookie = builder.cookie;
        this.cheese = builder.cheese;
        this.meat = builder.meat;
        this.vegetables = builder.vegetables;
    }

    /**
     * Uses a string builder to create a string and appends to it.
     * Loops through the fields and appends the field name + field value
     * There is a for loop for vegetables since there can be more than one vegetable
     * We have to check if the vegetables field is null before entering the for loop.
     *
     * @return content of sandwichSet in string format.
     */
    public String content() {
        StringBuilder sb = new StringBuilder("Sandwich set content:");
        for (Field field:getClass().getDeclaredFields()) {
            try {
                if (field.getName().equals("vegetables") && field.get(this) != null) {
                    sb.append(" "+ field.getName()+":");
                    for (int i =0 ;i < vegetables.length;i++) {
                        sb.append(" "+vegetables[i]);
                    }
                }
                else {
                    sb.append(" "+ field.getName() +": " + field.get(this) );
                }


            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();

    }



    /**
     * SandwichSetBuilder is an inner static class of SandwichSet class
     * The advantage of making it static: no need to instantiate outer class.
     * Meaning we can use SandwichSetBuilder and all of its methods without an instance of SandwichSet.
     */
    public static class SandwichSetBuilder {

        private static final Logger LOGGER = Logger.getLogger(SandwichSet.class.getName());
        private Bread bread;
        private Drink drink;
        private Cookie cookie;
        private Cheese cheese;
        private Meat meat;
        private Vegetable[] vegetables;

        /**
         * All functions below are of similar structure.
         * They set the given input to the respective attribute type.
         * And in the end return itself. As such we store intermediate results of the SandwichSetBuilder
         * So we are  building our class method by method.
         *
         * In this specific method we are give a breadType and we set the bread to that breadType.
         * Then we return this, i.e this SandwichSetBuilder.
         *
         * @param breadType
         * @return (SandwichSetBuilder) this
         */

        public SandwichSetBuilder withBread(Bread breadType) {

            this.bread = breadType;
            return this;
        }

        public  SandwichSetBuilder withDrink(Drink drinkType) {
            this.drink = drinkType;
            return this;
        }

        public SandwichSetBuilder withCookie(Cookie cookieType) {
            this.cookie = cookieType;
            return this;
        }
        public SandwichSetBuilder withChese(Cheese cheseType) {
            this.cheese = cheseType;
            return this;
        }

        public SandwichSetBuilder withMeat(Meat meatType) {
            this.meat = meatType;
            return this;
        }
        public SandwichSetBuilder withVegtables(Vegetable[] vegetables) {
            this.vegetables = vegetables;
            return this;
        }




        /**
         * The foreach loop is checking if any field is null.
         * if there exists null values a warning be received
         *
         * field.get(this) requires a IllegalAccess exception:
         * hence we create a try/catch.
         *
         * in the end we return the sandwich set.
         *
         * @return SandwichSet
         */
        public SandwichSet build() {
            for (Field field:getClass().getDeclaredFields()) {
                try {
                    if (field.get(this) == null) {
                        LOGGER.warning("field -> " + field.getName() +": is a null pointer!");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return new SandwichSet(this);
        }
    }

}
