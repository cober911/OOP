package HW.hw2.factory;

import java.util.ArrayList;
import HW.hw2.animals.Wolf;

public class WolfsFactory {

    public static ArrayList<Wolf> createWolfs (int wolfCount){
        ArrayList<Wolf> wolfInCage = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++) {
            Wolf wolf = new Wolf(10, 10, 10, 10);
            wolfInCage.add(wolf);
        }
        return wolfInCage;
    }
}
