public class Operators {
    public static void main(String[] args) {
        // unary operators
        int x = 7;
        x++; // x = x + 1
        boolean isKikker = true;
        boolean isBlauw = false;
        boolean isBlauweKikker = isKikker && isBlauw;
        boolean isBlauwOfKikker = isKikker || isBlauw;

        // casting
        double y = 2.9999999;
        int z = (int)y;
        System.out.println(z);

        long l = 12339999999945L;
        z = (int)l;
        System.out.println(z);



    }
}
