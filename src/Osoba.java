public class Osoba {
    private String imie, nazwisko, PESEL;

    public Osoba(String imie, String nazwisko, String PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    public Osoba(Osoba osoba)
    {
        imie = osoba.getImie();
        nazwisko = osoba.getNazwisko();
        PESEL = osoba.getPESEL();
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    public String getPESEL() {
        return PESEL;
    }

}