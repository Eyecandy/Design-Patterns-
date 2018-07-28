package factory;

import org.junit.Assert;
import org.junit.Test;

public class TestFactory {
    @Test
    public void TestFord() {
        CarFactory carFactory = new FordFactory();
        Car car = carFactory.manufactureCar(CarColor.SILVER);
        Assert.assertTrue(car.getCarBrand().equals("Ford") && car.getCarColor().equals(CarColor.SILVER));
    }


    @Test
    public void TestToyota() {
        CarFactory carFactory = new ToyotaFactory();
        Car car = carFactory.manufactureCar(CarColor.SILVER);
        Assert.assertTrue(car.getCarBrand().equals("Toyota") && car.getCarColor().equals(CarColor.SILVER));
    }




}