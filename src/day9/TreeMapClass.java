package day9;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {

        //sorts on basis on key
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(6000,"Filza");
        treeMap.put(5000,"Faizan");
        treeMap.put(3000,"Sneha");
        treeMap.put(4000,"faizan");
        System.out.println(treeMap);

        treeMap.forEach((k,v)-> System.out.println("Key :"+k+" Value: "+v));
        treeMap.firstKey();
        treeMap.lastKey();

        Set<Integer> keyLessThan3k = treeMap.tailMap(3000).keySet();
        System.out.println(keyLessThan3k);
        Set<Integer> keyGreaterThan3k = treeMap.headMap(3000).keySet();
        System.out.println(keyGreaterThan3k);
    }
}
