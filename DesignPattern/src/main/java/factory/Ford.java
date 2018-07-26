package factory;

final class Ford implements Car {

    private CarColor carColor;

    /**
     * Constructor
     *
     * @param carColor: color of Ford.
     */
    Ford(CarColor carColor) {
        this.carColor = carColor;
    }

    @Override
    public String getCarBrand() {
        return "Ford";
    }

    @Override
    public CarColor getCarColor() {
        return carColor;
    }
}
