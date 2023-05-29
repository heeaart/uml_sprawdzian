import java.util.Map;

public class Pracownia {

private Map<Osoba, Komputer> przypisania;

    public Map<Osoba, Komputer> getPrzypisania() {
        return przypisania;
    }

    public void setPrzypisania(Map<Osoba, Komputer> przypisania) {
        this.przypisania = przypisania;
    }
}
