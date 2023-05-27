package Practics.Practice03.num_2;

import Practics.Practice02.num_3.Circle;

import java.util.Comparator;

public class radiusComparator implements Comparator<Circle> {
    public int compare(Circle a, Circle b)
    {
        return (int)(a.getR() - b.getR());
    }
}
