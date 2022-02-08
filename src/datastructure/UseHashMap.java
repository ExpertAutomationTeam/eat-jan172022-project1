package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "NY");
        map.put(2, "NJ");
        map.put(3, "CA");

        System.out.println(map);

        for (Map.Entry ent: map.entrySet()) {
            System.out.println(ent.getKey()+" "+ent.getValue());
        }

    }
}
