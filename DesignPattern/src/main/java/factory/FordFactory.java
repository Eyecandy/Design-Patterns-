package factory;

final class FordFactory implements CarFactory {

    @Override
    public String getFactoryName() {
        return "Ford Factory";
    }

    @Override
    public Car manufactureCar(CarColor carColor) {
        return new Ford(carColor);
    }


}
