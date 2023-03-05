package HW.hw2;

public class Main {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Wolf wolf1 = new Wolf("волк 1");
        Wolf wolf2 = new Wolf("Волк 2");
        Wolf wolf3 = new Wolf("Волк 3");
        Wolf wolf4 = new Wolf("Волк 4");

        wolf.addAnimal(wolf1);
        wolf.addAnimal(wolf2);
        wolf.addAnimal(wolf3);
        wolf.addAnimal(wolf4);

        wolf.printAnimal(wolf.getLst_Animal());
        WolfCage wc = new WolfCage();
        wc.randomAnimal(wolf, wolf.getLst_Animal());
        wolf.sleepAnimal();
        
    }
}