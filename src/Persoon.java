import java.util.List;

public class Persoon {
    private List<Taal> talen;
    private List<String> telefoonNrs;

    public Persoon(List<Taal> talen, List<String> telefoonNrs) {
        this.talen = talen;
        this.telefoonNrs = telefoonNrs;
    }

    public List<Taal> getTalen() {
        return talen;
    }

    public void setTalen(List<Taal> talen) {
        this.talen = talen;
    }

    public List<String> getTelefoonNrs() {
        return telefoonNrs;
    }

    public void setTelefoonNrs(List<String> telefoonNrs) {
        this.telefoonNrs = telefoonNrs;
    }
}
