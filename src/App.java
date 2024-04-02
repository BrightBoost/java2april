import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Taal engels = new Taal("Engels", new String[]{"Noord-Amerika", "Groot-Brittannië"});
        Taal nederlands = new Taal("Nederlands", new String[]{"Nederland", "België"});
        Taal duits = new Taal("Duits", new String[]{"Duitsland", "Oostenrijk"});

        // Create persons with their languages and phone numbers
        List<Persoon> personen = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            List<Taal> talen = new ArrayList<>();
            talen.add(engels);
            talen.add(nederlands);
            talen.add(duits);

            List<String> telefoonNrs = new ArrayList<>();
            telefoonNrs.add("123-456-789");
            telefoonNrs.add("987-654-321");
            telefoonNrs.add("456-789-123");

            Persoon persoon = new Persoon(talen, telefoonNrs);
            personen.add(persoon);
        }

        // Initialize Bedrijf with the list of persons
        Bedrijf bedrijf = new Bedrijf(personen);

        for(int p = 0; p < bedrijf.getPersoonList().size(); p++) {
            for(int t = 0; t < bedrijf.getPersoonList().get(p).getTalen().size(); t++) {
                for(int r = 0; r < bedrijf.getPersoonList().get(p).getTalen().get(t).getRegios().length; r++) {
                    System.out.println(bedrijf.getPersoonList().get(p).getTalen().get(t).getRegios()[r]);
                }
            }
        }
    }
}
