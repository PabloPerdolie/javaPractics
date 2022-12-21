package Practice3.num_2;

import Practice2.num_3.Circle;
import Practice2.num_3.Point;
import java.util.Comparator;

public class radiusComparator implements Comparator<Circle> {
    public int compare(Circle a, Circle b)
    {
        return (int)(a.getR() - b.getR());
    }
}
