package Zad4;

import java.util.ArrayList;
public class MultiZbiorUporzadkowany extends MultiZbior{
    public MultiZbiorUporzadkowany(){
        elements = new ArrayList<>();
    }
    @Override
    protected void dodaj(int x) {
        int i = 0;
        while (i < this.elements.size() && this.elements.get(i) < x) {
            i++;
        }
        this.elements.add(i, x);
    }

    @Override
    protected int usunMax() {
        return this.elements.remove(this.elements.size()-1);
    }
}
