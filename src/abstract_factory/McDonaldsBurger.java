package abstract_factory;

public class McDonaldsBurger implements Burger{
    private final String NAME = "McDonald's burger";

    @Override
    public String getName() {
        return NAME;
    }
}
