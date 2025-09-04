package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();

        car.setYear(2006);
        car.setOwnerName("Timoti");
        car.setInsuranceNumber(122202567);

        electricCar.setYear(2017);
        electricCar.setOwnerName("Vanya");
        electricCar.setInsuranceNumber(133202543);

        int cap;
        cap = electricCar.getBatteryCapacity();
        System.out.println(cap);

        car.ToString();
        electricCar.ToString();

    }
}