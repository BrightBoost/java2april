import java.util.ArrayList;
import java.util.List;

public class Bedrijf {
    public Bedrijf(List<Persoon> persoonList) {
        this.persoonList = persoonList;
    }

    private List<Persoon> persoonList;

    public List<Persoon> getPersoonList() {
        return persoonList;
    }

    public void setPersoonList(List<Persoon> persoonList) {
        this.persoonList = persoonList;
    }


}
