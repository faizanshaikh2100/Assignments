package ExtraAssignments.MultiComparingComparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MultiComparingUsingComparator {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"Filza"));
        personList.add(new Person(1,"Faizan"));
        personList.add(new Person(2,"Sneha"));
        personList.add(new Person(2,"Rohit"));

        //if on the basis of id comparator if two person has same id then it will
        // sort on the basis of names using names comparator
        Comparator<Person> byId = Comparator.comparing(Person::getId);
        Comparator<Person> byName = Comparator.comparing(Person::getName);
        personList.sort(byId.thenComparing(byName));
        for(Person p:personList){
            System.out.println(p.toString());
        }
    }
}
 class Person implements Comparator<Person> {
    private int id;
    private String name;

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Person(int id, String name) {
         this.id = id;
         this.name = name;
     }

     @Override
     public String toString() {
         return "Person{" + "id=" + id + ", name='" + name  + '}';
     }

     @Override
    public int compare(Person p1, Person p2) {
        int result = Integer.compare(p1.getId(), p2.getId());
        if (result == 0) {
            result = p1.getName().compareTo(p2.getName());
        }
        return result;
    }
}
