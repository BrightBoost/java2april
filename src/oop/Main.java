package oop;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Boat boat = new Boat(false);
        Bicycle bicycle = new Bicycle();
        Car car = new Car();

        boat.start();
        System.out.println(boat.isLeaking());

        bicycle.ringBell();
        bicycle.stop();
        car.honk();
    }
}
