package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    //public ElectricCar(String model, String license, String color, int year, String ownerName,
    // int insuranceNumber, String engineType) {
    // super(model, license, color, year, ownerName, insuranceNumber, engineType);
    // }

    public String  vehicleType() {
        return String.format("%s Car", engineType);
    }

    public void setBatteryCapacity(int capacity) {
        this.batteryCapacity = capacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}
