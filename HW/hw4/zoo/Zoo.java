package HW.hw4.zoo;

import HW.hw4.animals.Lion;
import HW.hw4.animals.Snake;
import HW.hw4.animals.Wolf;
import HW.hw4.cage.AnimalCage;

public class Zoo {
    private AnimalCage<Wolf> wolfCage;
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snaktCage;

    public AnimalCage<Wolf> getwolfCage() {
        return wolfCage;
    }
    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }
    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.wolfCage = wolfCage;
    }

    public AnimalCage<Snake> getSnaktCage() {
        return snaktCage;
    }
    public void setSnaktCage(AnimalCage<Snake> snaktCage) {
        this.snaktCage = snaktCage;
    }
}