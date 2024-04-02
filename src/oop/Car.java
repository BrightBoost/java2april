package oop;

public class Car extends Vehicle implements Chargeable {
    public void honk() {
        System.out.println("honk!");
    }

    @Override
    public void charge() {
        System.out.println("charging car");
    }
    Object
}
