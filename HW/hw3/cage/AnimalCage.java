package HW.hw3.cage;

import HW.hw3.animals.Animal;

public interface AnimalCage {

    int addAnimal(Animal animal);

    int delyverFeed(int weightOfFood);

    boolean cleanCage();

    void getAnimal();
}
