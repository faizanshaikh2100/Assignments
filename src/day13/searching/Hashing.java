package day13.searching;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int key = 11;
        map.put(12,0);
        map.put(2,1);
        map.put(30,2);
        map.put(11,3);
        map.put(6,4);
        map.put(67,5);
        map.put(29,6);
        if (map.containsKey(key)){
            System.out.println(map.get(key));
            return;
        }
        System.out.println(-1);
    }
}
