import java.util.ArrayList;
import java.util.List;

public class Method {
    public static void main(String[] args) {
        Method m = new Method();
        m.doIets();
    }
    // naam - kleine letter start
    public void doIets() {
       // body van de method
        System.out.println("ik doe iets");

    }

    // parameter lijst
    public void doIetsAnders(int x, String s) {
        doIets();
    }

    // return type
    public List<Double> geefGetal() {
        List<Double> getallen = new ArrayList<>();
        getallen.add(3.0);
        return getallen;
    }

    // modifiers - public/protected/private/niets=default - static (en nog meer details voor later)
}
