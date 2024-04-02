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
        do {
            System.out.println("wordt altijd tenminste 1x uitgevoerd");
        } while(!isAan);

        String[] vogels = { "pluto", "mentos" };
        // for each
        for(String name : vogels) {
            System.out.println(name);
        }

        for(int i = 0; i < vogels.length; i++) {
            System.out.println(vogels[i]);

            if(vogels[i].equals("pluto")) {
                break;
            }
        }

        // zonder break
        boolean birdFound = false;
        int i = 0;
        while(!birdFound) {
            System.out.println(vogels[i]);
            if(vogels[i].equals("pluto")) {
                birdFound = true;
            }
            i++;
        }

        // zonder break met for loop
        boolean birdFound2 = false;
        for(int j = 0; j < vogels.length && !birdFound2; j++) {
            System.out.println(vogels[j]);
            if(vogels[j].equals("pluto")) {
                birdFound2 = true;
            }
        }
    }
}
