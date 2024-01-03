package Homework.Topic1;

public class Car {
    private String brand;
    private String model;
    private int manufacturingYear;
    private double price;
    private boolean isAutomatic;
    private Engine engine;

    public Car(String brand, String model, int manufacturingYear, double price, boolean isAutomatic, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.price = price;
        this.isAutomatic = isAutomatic;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Price: $" + price);
        System.out.println("Transmission: " + (isAutomatic ? "Automatic" : "Manual"));

        if (engine != null) {
            System.out.println("Engine Type: " + engine.getType());
            System.out.println("Horsepower: " + engine.getHorsepower());
        }
    }
}
