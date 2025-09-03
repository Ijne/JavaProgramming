package vehicles;

public class Vehicle {
    protected String model;
    protected String license;
    protected String color;
    protected int year;

    protected String ownerName;
    protected int insuranceNumber;
    protected String engineType;

    //public Vehicle(String model, String license, String color, int year, String ownerName,
    // int insuranceNumber, String engineType) {
    // this.model = model;
    // this.license = license;
    // this.color = color;
    // this.year = year;

    // this.ownerName = ownerName;
    // this.insuranceNumber = insuranceNumber;
    // this.engineType = engineType;
    // }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String vehicleType() {
        return null;
    }

    public void ToString() {
        System.out.format("Model: %s License: %s Color: %s Year: %d Owner: %s Insurance: %d EngineType: %s\n",
                model, license, color, year, ownerName, insuranceNumber, engineType);
    }
}
