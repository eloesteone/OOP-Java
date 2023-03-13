package Zad2;

public class Osoba {
    private String imie;
    private double stanPortfela;

    public Osoba(String imie, double stanPortfela) {
        this.imie = imie;
        this.stanPortfela = stanPortfela;
    }

    class Pupil {
        private String imie;
        private String gatunek;
        private int cenaKarmy;

        public Pupil(String imie, String gatunek, int cenaKarmy) {
            this.imie = imie;
            this.gatunek = gatunek;
            this.cenaKarmy = cenaKarmy;
        }

        void nakarm() {
            if(stanPortfela<=0){
                System.out.println("Nie wystarczajacy stan portfela");
            }else{
                System.out.println(stanPortfela-=cenaKarmy);
            }

        }
    }

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Kacper", 0);
        Osoba.Pupil pupil = osoba.new Pupil("Chapsio", "Pies", 1);

        System.out.println(osoba.imie + osoba.stanPortfela);
        System.out.println(pupil.imie+pupil.gatunek);
        pupil.nakarm();
        pupil.nakarm();

    }
}
