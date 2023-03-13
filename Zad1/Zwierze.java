package Zad1;

public abstract class Zwierze {
    public abstract String odglos();

    public void koncert() {
        for(int i = 0; i < ilePowtorzen(); i++){
            System.out.print(odglos() + " ");
        }
        System.out.println();
    }

    public int ilePowtorzen(){
        return ilePowtorzen();
    }

}
