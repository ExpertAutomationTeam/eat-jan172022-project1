package datastructure;

import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("A");

        System.out.println(list);


    }
}
