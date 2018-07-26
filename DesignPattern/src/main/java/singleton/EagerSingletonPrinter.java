package singleton;

/**
 * TODO: create singleton at runtime.
 * Use case: When there can only be one instance of the class and a single access point.
 */
class EagerSingletonPrinter {

    private EagerSingletonPrinter() {}

    private static final EagerSingletonPrinter instance = new EagerSingletonPrinter();



    public static EagerSingletonPrinter getInstance() {
        return instance;
    }


    public static String displayMessage() {
        return "Eager singleton printer reporting for duty!";
    }
}
