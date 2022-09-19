# DAA-ASSIGNMENT-02
**Problem Statement:** 

Implement the solution for sorting the array in which each element is defined as [a,b] for example [2,3]. 

Input: "1": Result: Sorted array: on value "a" 

Input: "2": Result: Sorted array on value "b" 

---------------------------------------------------------------------------------------------------------- 

**Explanation:** 

    >>Created a class named ‘arrPair’ which will have variable declarations of ‘a’ and ‘b’ both 
    of ‘int’ data type, the class will also have a blank constructor and a parameterized 
    constructor with both the parameters, it will also contain a display method. 

    >>Created 2 comparator classes, one for comparing and sorting on basis of ‘a’ and other 
    constructor to sort on basis ‘b’, in ArrayList of [a,b] by making the class implement 
    Comparator and override compare method. 

    >>In ‘main’ method, we are providing input as an array of type arrPair, then converted it 
    to an arrayList using asList(). Then using Collections.sort(), sorted the arrayList on 
    basis of a and b respectively. After sorting converted the ArrayList into an array using 
    toArray() and displayed it by display() in arrPair class.
    
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
