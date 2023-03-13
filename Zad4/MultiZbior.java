package Zad4;
import java.util.List;

public abstract class MultiZbior {
    protected List<Integer> elements;
    protected abstract void dodaj(int num);

    protected abstract int usunMax();

    protected void wypiszIUsunNajwieksze(int k){
        for(int i = 0; i<k; i++){
            System.out.println(usunMax());
        }

    }
}
