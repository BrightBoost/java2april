import java.util.ArrayList;
import java.util.List;

public class Main {

    // startpunt van de applicatie
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("bla");

        String[] strArr = new String[5];
        strArr[0] = "bla";
        // strArr[5] = "bla"; //java.lang.ArrayIndexOutOfBoundsException

        StaticVoorbeeld s1 = new StaticVoorbeeld();
        StaticVoorbeeld s2 = new StaticVoorbeeld();
        s1.x = 6;
        System.out.println(s2.x);

        s1.y = 10;

        if(s1.y > 10) {
            int z = 3;
        }
        // ik ken z niet

        Dog d1 = new Dog();
//        d1.setColor("blond");
        System.out.println(d1.getColor());
        d1.setColor("paars");
        System.out.println(d1.getColor());


    }
}