package day9;

import java.util.*;

public class CustomArrayList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if(this.contains(o)) {
            return true;
        }
        else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //		Set<GeniusStudent> setStudent = new HashSet<>();
        List<GeniusStudent> setStudent = new ArrayList<GeniusStudent>();

        GeniusStudent gst1 = new GeniusStudent(101, "Filza");
        GeniusStudent gst2 = new GeniusStudent(101, "Sneha");

        setStudent.add(gst1);
        setStudent.add(gst2);

//        Collections.sort(setStudent,new IdComparator());

        System.out.println(setStudent);
    }

    }
