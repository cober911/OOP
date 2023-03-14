package HW.hw2.cage;

import HW.hw2.animals.Animal;

public interface AnimalCage {

    int addAnimal(Animal animal);

    int delyverFeed(int weightOfFood);

    boolean cleanCage();

    void getAnimal();
}
