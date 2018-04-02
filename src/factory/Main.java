package factory;

import java.util.logging.Logger;

class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    /**
     * entry point
     * @param args:
     */
    public static void main(String[] args) {
        Main main = new Main();
        //Creates a toyota factory and starts manufacturing toyota in specified colors.
        CarFactory toyotaFactory = new ToyotaFactory();
        main.startManufacturing(toyotaFactory);
        //Creates a Ford factory and starts manufacturing ford in specified colors.
        CarFactory fordFactory = new FordFactory();
        main.startManufacturing(fordFactory);


    }

    /**
     * @param carFactory: used to produce cars. depending on the type of the factory (ToyotaFactory or FordFactory).
     * It will produce the correct car brand, i.e Ford or Toyota.
     */
    private void startManufacturing(CarFactory carFactory) {
        Car car1 = carFactory.manufactureCar(CarColor.SILVER);
        LOGGER.info(carFactory.getFactoryName() + " produced a new "
                + car1.getCarBrand() + " in " + car1.getCarColor() + " color.");

        Car car2 = carFactory.manufactureCar(CarColor.BLACK);
        LOGGER.info(carFactory.getFactoryName() + " produced a new "
                + car2.getCarBrand() + " in " + car2.getCarColor() + " color.");

    }

}
