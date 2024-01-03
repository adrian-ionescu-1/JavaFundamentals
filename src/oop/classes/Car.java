package oop.classes;

public class Car {

    private String color;
    private String brand;
    private int maxSpeed;

    public Car(String color, String brand, int maxSpeed) {
        this(brand, maxSpeed);
        this.color = color;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public Car(int maxSpeed, String color, String brand) {
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void printAllCarParameters() {
        System.out.printf("The car color is %s, the brand is %s and max speed is %s \n", color, brand, maxSpeed);
    }
}
