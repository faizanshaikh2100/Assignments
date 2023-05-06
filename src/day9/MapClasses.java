package day9;

import java.util.HashMap;
import java.util.Map;

public class MapClasses {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","A");
        map.put("b","B");

        map.put("d",null);
        map.put(null,"nullVal");
        map.put(null,null);
        map.put("e",null);
        System.out.println(map);
    }
}
