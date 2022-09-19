import java.util.*;

public class aComparator implements Comparator<arrPair> {

    @Override
    public int compare(arrPair p1, arrPair p2) {
        if (p1.a < p2.a)
            return -1;
        else if (p1.a > p2.a)
            return 1;
        else
            return 0;
    }

}
