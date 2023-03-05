package HW.hw2;

import java.util.List;
import java.util.Random;

public class WolfCage  implements AnimalCage  {

    

    public WolfCage() {
    }

    public void randomAnimal(Object a,List lst) {
        
        Random rand = new Random();
        System.out.println( lst.get(rand.nextInt(0,lst.size()))+" сбежал с клетки");
    }
}