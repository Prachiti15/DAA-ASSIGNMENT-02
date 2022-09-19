import java.util.*;

public class Test {
    public static void main(String[] args) {
        arrPair arrL[] = new arrPair[10];
        arrL[0] = (new arrPair(1, 2));
        arrL[1] = (new arrPair(3, 4));
        arrL[2] = (new arrPair(81, 50));
        arrL[3] = (new arrPair(78, 35));
        arrL[4] = (new arrPair(11, 26));
        arrL[5] = (new arrPair(3, 5));
        arrL[6] = (new arrPair(17, 55));
        arrL[7] = (new arrPair(91, 27));
        arrL[8] = (new arrPair(15, 27));
        arrL[9] = (new arrPair(87, 25));

        List<arrPair> arrlist = new ArrayList<arrPair>(10);
        arrlist = Arrays.asList(arrL);
        System.out.println("SORTED ON 1st value ");
        Collections.sort(arrlist, new aComparator());
        arrL = arrlist.toArray(new arrPair[arrlist.size()]);
        for (arrPair i : arrL) {
            i.display();
        }

        System.out.println("\nSORTED ON 2nd value ");
        Collections.sort(arrlist, new bComparator());
        arrL = arrlist.toArray(new arrPair[arrlist.size()]);
        for (arrPair i : arrL) {
            i.display();
        }
    }

}
