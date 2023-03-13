package Zad4;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MultiZbior multiZbiorNU = new MultiZbiorNieuporzadkowany();
        MultiZbior multiZbiorU = new MultiZbiorUporzadkowany();
        System.out.println("multiZbiorNieuporzadkowany");
        test(multiZbiorNU);
        System.out.println("multiZbiorUporzadkowany");
        test(multiZbiorU);
    }

    public static void test(MultiZbior mz){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            mz.dodaj(new Random().nextInt(1000));
        }
        for (int i = 0; i < 5; i++) {
            mz.dodaj(new Random().nextInt(10));
        }
        mz.wypiszIUsunNajwieksze(4);
        long duration = System.currentTimeMillis() - start;
        System.out.println("duration: " + duration);
    }
}
