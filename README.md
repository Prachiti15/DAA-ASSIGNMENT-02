# DAA-ASSIGNMENT-02
**Problem Statement:** 

Implement the solution for sorting the array in which each element is defined as [a,b] for example [2,3]. 

Input: "1": Result: Sorted array: on value "a" 

Input: "2": Result: Sorted array on value "b" 

---------------------------------------------------------------------------------------------------------- 

**Explanation:** 

    >>Created a class named ‘arrPair’ which will have variable declarations of ‘a’ and ‘b’ both of ‘int’ data type, the class will also have a blank constructor and a 
    parameterized constructor with both the parameters, it will also contain a display method. 

    >>Created 2 comparator classes, one for comparing and sorting on basis of ‘a’ and other constructor to sort on basis ‘b’, in ArrayList of [a,b] by making the class 
    implement Comparator and override compare method. 

    >>In ‘main’ method, created an ArrayList ‘arrL’ of type ‘arrPair’ and add the pairs in the arrayList. Then using Collections.sort(), sorted the arrayList on basis 
    of a and b. 
    
---------------------------------------------------------------------------------------------------------- 

**CODE:**
**arrPair.java**
```
class arrPair {
    int a, b;

    arrPair() {
    }

    arrPair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println(a + "," + b);
    }

}
```

**aComparator.java**
```
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
```

**bComparator.java**
```
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

```

**Test.java**
```
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
```
---------------------------------------------------------------------------------------------------------- 

**OUTPUT:**
```
SORTED ON 1st value 
1,2
3,4
3,5
11,26
15,27
17,55
78,35
81,50
87,25
91,27

SORTED ON 2nd value 
1,2
3,4
3,5
87,25
11,26
15,27
91,27
78,35
81,50
17,55
```
