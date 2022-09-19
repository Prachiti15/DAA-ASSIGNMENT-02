import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<arrPair> arrL = new ArrayList<arrPair>(10);
        arrL.add(new arrPair(1, 2));
        arrL.add(new arrPair(3, 4));
        arrL.add(new arrPair(81, 50));
        arrL.add(new arrPair(78, 35));
        arrL.add(new arrPair(11, 26));
        arrL.add(new arrPair(3, 5));
        arrL.add(new arrPair(17, 55));
        arrL.add(new arrPair(91, 27));
        arrL.add(new arrPair(15, 27));
        arrL.add(new arrPair(87, 25));
        System.out.println("SORTED ON 1st value ");
        Collections.sort(arrL, new aComparator());
        for (arrPair i : arrL) {
            i.display();
        }

        System.out.println("\nSORTED ON 2nd value ");
        Collections.sort(arrL, new bComparator());
        for (arrPair i : arrL) {
            i.display();
        }
    }

}
