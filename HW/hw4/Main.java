package HW.hw4;

import java.util.ArrayList;

import HW.hw4.animalUtils.AnimalUtils;
import HW.hw4.animals.Lion;
import HW.hw4.animals.Wolf;
import HW.hw4.factory.LionsFactory;
import HW.hw4.factory.WolfsFactory;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(10);
        for (Lion lion : lions) {
            System.out.println(lion);
        }
        System.out.println("_______________________");
        AnimalUtils.sortAnimalsAge(lions);
        for (Lion lion : lions) {
            System.out.println(lion);
        }

        System.out.println("__________wolfs_____________");

        ArrayList<Wolf> wolfs = WolfsFactory.createWolfs(10);
        for (Wolf wolf : wolfs) {
            System.out.println(wolf);
        }
        System.out.println("_______________________");
        AnimalUtils.sortAnimalsWeight(wolfs);
        for (Wolf wolf : wolfs) {
            System.out.println(wolf);
        }
    }
}
