package abstract_factory;

class McDonaldsSoftDrink implements  SoftDrink{
    private final String NAME = "soft drink from MC Donald's";

    @Override
    public String getName() {
        return NAME;
    }
}
