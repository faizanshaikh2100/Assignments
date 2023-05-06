package day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeClass {
    public static void main(String[] args) {
        Map<Integer,String> map = new ConcurrentHashMap<>();

        map.put(1,"Just");
        map.put(2,"The");
        map.put(3,"Two");
        map.put(4,"Of");
        Iterator itr = map.entrySet().iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            map.put(5,"Us");
        }


    }
}
