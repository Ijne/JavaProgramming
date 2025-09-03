package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Task1--------\n");
        Car fuelCar = new Car();
        ElectricCar electricCar = new ElectricCar();

        //System.out.println(fuelCar.ownerName);
        //System.out.println(fuelCar.insuranceNumber);
        // System.out.println(fuelCar.engineType);

        // System.out.println(electricCar.ownerName);
        // System.out.println(electricCar.insuranceNumber);
        // System.out.println(electricCar.engineType);

        fuelCar.setEngineType("Fuel");
        electricCar.setEngineType("Electric");

        fuelCar.ToString();
        electricCar.ToString();

        System.out.println(fuelCar.vehicleType());
        System.out.println(electricCar.vehicleType());

    }
}