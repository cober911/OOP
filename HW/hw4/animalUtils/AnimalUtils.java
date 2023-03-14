package HW.hw4.animalUtils;

import java.util.Collections;
import java.util.List;
import HW.hw4.animals.Animal;
import HW.hw4.comparators.AnimalAgeComparator;
import HW.hw4.comparators.AnimalWeightComparator;

public class AnimalUtils {
    public static <T extends Animal> List<T> sortAnimalsAge(List<T> animalList) {
        Collections.sort(animalList, new AnimalAgeComparator());
        return animalList;
    }

    public static <T extends Animal> List<T> sortAnimalsWeight(List<T> animalList) {
        Collections.sort(animalList, new AnimalWeightComparator());
        return animalList;
    }
}
