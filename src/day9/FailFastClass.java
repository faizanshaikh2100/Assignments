package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastClass {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        List<String>list = new CopyOnWriteArrayList<>();

        list.add("a");
        list.add("b");
        Iterator<String>itr = list.iterator();

        while (itr.hasNext()){
            String el = itr.next();
            System.out.println(el);
            list.add("c");
        }
        System.out.println(list);
    }
}
