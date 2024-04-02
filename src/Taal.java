public class Taal {
    private String naam;
    private String[] regios;

    public Taal(String naam, String[] regios) {
        this.naam = naam;
        this.regios = regios;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String[] getRegios() {
        return regios;
    }

    public void setRegios(String[] regios) {
        this.regios = regios;
    }
}
