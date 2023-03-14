package HW.hw4.comparators;

import java.util.Comparator;
import HW.hw4.animals.Snake;

public class SnakeComparator implements Comparator<Snake>{
    @Override
    public int compare(Snake o1, Snake o2) {
        if (o1.getBodyLenght() > o2.getBodyLenght()) {
            return 1;
        } else if (o1.getBodyLenght() < o2.getBodyLenght()) {
            return -1;
        }
        return 0;
    }
}
