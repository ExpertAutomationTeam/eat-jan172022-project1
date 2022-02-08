package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {

        //list is an ordered list
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(23);
        numList.add(54);
        numList.add(2);
        numList.add(65);
        numList.add(Integer.parseInt("78"));
        numList.add(23);
        numList.add(23);

        System.out.println(numList);

//        System.out.println(numList.get(0));
//
//        for (int i = 0; i < numList.size(); i++) {
//            System.out.println(numList.get(i));
//        }
//
        List<String> numList2 = new ArrayList<>();
        numList2.add("Z");
        numList2.add("A");
        numList2.add("C");
        numList2.add("B");
        System.out.println(numList2);
//
//        List<Object> numList3 = new ArrayList<>();
//        numList3.add("name");
//        numList3.add(54);
//        numList3.add('&');
//        numList3.add(true);
//        numList3.add(3.986);

    }
}
