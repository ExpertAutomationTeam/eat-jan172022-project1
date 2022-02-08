package datastructure;

import java.util.HashSet;
import java.util.Set;

public class UseHashSet {
    public static void main(String[] args) {

        //set is unordered list (set order doesn't matter)
        Set<String> hs = new HashSet<>();

        hs.add("Z");
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("A");
        hs.add("D");


        System.out.println(hs);

        Set<Integer> hs2 = new HashSet<>();

        hs2.add(8);
        hs2.add(3);
        hs2.add(8);
        hs2.add(1);
        hs2.add(0);

        System.out.println(hs2);

        Set<Object> hs3 = new HashSet<>();

        hs3.add("Z");
        hs3.add(3);
        hs3.add(true);
        hs3.add(1);
        hs3.add("A");

        System.out.println(hs3);

        int [] array1 = { 1, 3, 2, 4, 8, 9, 0 };
        int [] array2 = { 1, 3, 7, 5, 4, 0, 7, 5 };

        //find union of these 2 array
        //find intersection of the 2 arrays
        //find symmetric difference

    }
}
