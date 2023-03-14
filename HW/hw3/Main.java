package HW.hw3;

import java.util.ArrayList;

import HW.hw3.animals.Lion;
import HW.hw3.animals.Wolf;
import HW.hw3.cage.LionCage;
import HW.hw3.cage.WolfCage;
import HW.hw3.factory.LionsFactory;
import HW.hw3.factory.WolfsFactory;

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
