package factory;

final class Toyota implements Car {

    private CarColor carColor;

    /**
     * Constructor
     * @param carColor: color of the Toyota.
     */
    Toyota(CarColor carColor) {
        this.carColor = carColor;
    }

    @Override
    public String getCarBrand() {
        return "Toyota";
    }

    @Override
    public CarColor getCarColor() {
        return carColor;
    }
}
