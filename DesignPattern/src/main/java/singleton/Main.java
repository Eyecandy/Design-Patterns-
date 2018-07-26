package singleton;

/**
 * Creational Design Pattern
 */

class Main {
    public static void main(String[] args) {
        /**
         * Testing the EagerSingletonPrinter
         * EagerSingletonPrinter eagerSingletonPrinter = new EagerSingletonPrinter() -> can not be performed because constructor is private
         */
        EagerSingletonPrinter eagerSingletonPrinter = EagerSingletonPrinter.getInstance();
        System.out.println(eagerSingletonPrinter.displayMessage());
        /**
         * Testing LazyPrinterSingleton
         * LazyPrinterSingleton lazyPrinterSingleton = new LazyPrinterSingleton() -> can not be performed because constructor is private
         */
        LazyPrinterSingleton lazyPrinterSingleton = LazyPrinterSingleton.getInstance();
        System.out.println(lazyPrinterSingleton.displayMessage());


    }

}
