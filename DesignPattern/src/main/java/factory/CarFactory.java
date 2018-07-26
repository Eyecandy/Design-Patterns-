package factory;

interface CarFactory {
    String getFactoryName();

    Car manufactureCar(CarColor carColor);

}
