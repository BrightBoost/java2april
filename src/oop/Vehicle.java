package oop;

public class Vehicle {
    private String color;
    private int maxSpeed;

    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle() {
    }

    public void start() {
        System.out.println("Starting vehicle");
    }

    public void stop() {
        System.out.println("Stopping vehicle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
