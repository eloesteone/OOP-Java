package Zad4;

import java.util.ArrayList;
public class MultiZbiorNieuporzadkowany extends MultiZbior{

    public MultiZbiorNieuporzadkowany() {
        this.elements = new ArrayList<>();
    }
    @Override
    protected void dodaj(int x){
        this.elements.add(x);
    }

    @Override
    protected int usunMax() {
        int maxElement = 0;
        int lastElement = elements.get(elements.size()-1);
        for(int i = 0; i < this.elements.size(); i++){
            if(elements.get(i) > maxElement){
                maxElement = elements.get(i);
            }
        }
        this.elements.set(maxElement, lastElement);



        return maxElement;
    }

}
