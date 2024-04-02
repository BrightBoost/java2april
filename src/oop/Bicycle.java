package oop;

public class Bicycle extends Vehicle {
    public void ringBell() {
        System.out.println("tring!");
    }

    @Override
    public void stop() {
        System.out.println("fiets stopt");
    }
}
