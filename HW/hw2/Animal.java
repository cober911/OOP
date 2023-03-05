package HW.hw2;

import java.util.ArrayList;
import java.util.List;

class Animal {
    private String name;
    private List<Animal> lst_Animal;

    public Animal() {
        this.lst_Animal = new ArrayList<>();
    }

    public Animal(String firstAnimal) {
        this.name = firstAnimal;
        this.lst_Animal = new ArrayList<>();
    }


    public List<Animal> getLst_Animal() {
        return lst_Animal;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return   getName();
    }


    public void addAnimal(Object a) {
        lst_Animal.add((Animal) a);

    }

    public void sleepAnimal() {
        System.out.println("Животное спит");
    }

    public void printAnimal(List lst ) {
        for (Object i : lst) {
            System.out.println(i);
        }
    }
}