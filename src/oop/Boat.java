package oop;

public class Boat extends Vehicle { // boat is de kind klas, vehicle is parent
    private boolean leaking;

    public boolean isLeaking() {
        return leaking;
    }
    public Boat(boolean leaking) {
        super("black", 10);
        this.leaking = leaking;
    }


    public void setLeaking(boolean leaking) {
        this.leaking = leaking;
    }
}
