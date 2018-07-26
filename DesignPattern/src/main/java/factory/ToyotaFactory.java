package factory;

/**
 * Produces Toyota with a color
 */
final class ToyotaFactory implements CarFactory {

    @Override
    public String getFactoryName() {
        return "Toyota Factory";
    }

    @Override
    public Car manufactureCar(CarColor carColor) {
        return new Toyota(carColor);
    }
}
