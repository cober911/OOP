package HW.hw2;

import java.util.ArrayList;

import HW.hw2.animals.Lion;
import HW.hw2.animals.Wolf;
import HW.hw2.cage.LionCage;
import HW.hw2.cage.WolfCage;
import HW.hw2.factory.LionsFactory;
import HW.hw2.factory.WolfsFactory;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(10);
        LionCage lionsInCage = new LionCage(lions);
        System.out.println(lionsInCage);

        ArrayList<Wolf> wolfs = WolfsFactory.createWolfs(10);
        WolfCage wolfInCage = new WolfCage(wolfs);
        System.out.println(wolfInCage);

    }
}
