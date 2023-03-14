package HW.hw2.factory;

import java.util.ArrayList;
import HW.hw2.animals.Lion;

public class LionsFactory {

    public static ArrayList<Lion> createLions (int lionCount){
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            Lion lion = new Lion(10, 10, 10, 10);
            lionInCage.add(lion);
        }
        return lionInCage;
    }
}
