import java.util.*;

public class bComparator implements Comparator<arrPair> {
    
    @Override
    public int compare(arrPair p1, arrPair p2) {
        if (p1.b < p2.b)
            return -1;
        else if (p1.b > p2.b)
            return 1;
        else
            return 0;
    }

}
