public class Loops {
    public static void main(String[] args) {
        // while - iets moet gebeuren TOTDAT
        boolean isAan = false;
        while(!isAan) {
            System.out.println("Zoek het lichtknopje...");
            if(Math.random() > 0.5) {
                isAan = true;
            }
        }

        // for - iets moet x keer gebeuren
        int[][] ints = {
                {1, 3, 5},
                {3, 6, 7}
        };
        for(int i = 0; i < ints.length; i++) {
            for(int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }

        // do while

        // for each
    }
}
