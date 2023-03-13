package Zad3;

public class Osoba {
    private final String imie;
    private final String nazwisko;
    private final String eMail;
    private final String adres;
    private final String idDowod;

    private Osoba(Builder builder) {
        this.imie = builder.imie;
        this.nazwisko = builder.nazwisko;
        this.eMail = builder.eMail;
        this.adres = builder.adres;
        this.idDowod = builder.idDowod;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String geteMail() {
        return eMail;
    }

    public String getAdres() {
        return adres;
    }

    public String getIdDowod() {
        return idDowod;
    }

    public static class Builder {
        private String imie;
        private String nazwisko;
        private String eMail;
        private String adres;
        private String idDowod;

        public Builder setImie(String imie) {
            this.imie = imie;
            return this;
        }

        public Builder setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder seteMail(String eMail) {
            this.eMail = eMail;
            return this;
        }

        public Builder setAdres(String adres) {
            this.adres = adres;
            return this;
        }

        public Builder setIdDowod(String idDowod) {
            this.idDowod = idDowod;
            return this;
        }

        public Osoba build(){
            return new Osoba(this);
        }
    }

    public static void main(String[] args) {
        Osoba adam = new Osoba.Builder().setImie("Kacper").setNazwisko("Baran").seteMail("kb@jp").setAdres("dupa").setIdDowod("dupahuj").build();
        System.out.println(adam.imie + adam.nazwisko + adam.eMail + adam.adres + adam.idDowod);

    }
}
