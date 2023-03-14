package HW.hw4.cage;

import java.util.ArrayList;
import java.util.Collections;
import HW.hw4.animals.Animal;
import HW.hw4.comparators.AnimalAgeComparator;
import HW.hw4.comparators.AnimalWeightComparator;

public interface AnimalCage<T extends Animal> {

    int addAnimal(T animal);

    int delyverFeed(int weightOfFood);

    boolean cleanCage();

    void getAnimal();

    default void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalAgeComparator());
    }

    default void sortByWeight (ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalWeightComparator());
    }
}
