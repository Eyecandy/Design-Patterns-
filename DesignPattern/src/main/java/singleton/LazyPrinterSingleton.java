package singleton;

/**
 * TODO: Create singleton when needed, i.e getInstance is called.
 * Use case: When there can only be one instance of the class and a single access point.
 * Lazy initialization is done to improve performance, created on first use.
 */
class LazyPrinterSingleton {
    private static LazyPrinterSingleton lazyPrinterSingleton = null;

    private LazyPrinterSingleton() {
    }

    public static LazyPrinterSingleton getInstance() {
        if (lazyPrinterSingleton == null) {
            lazyPrinterSingleton = new LazyPrinterSingleton();
            return lazyPrinterSingleton;
        }
        return lazyPrinterSingleton;
    }

    public static String displayMessage() {
        return "Lazy singleton printer reporting for duty!";
    }

}
