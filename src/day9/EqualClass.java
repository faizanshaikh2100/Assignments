package day9;

public class EqualClass {

    public static void main(String[] args) {
         int int1 = 4;
         int int2 = 4;
         System.out.println(int1==int2?"Equal":"Not Equal");

         String s = "Wiley";
         String s1 = "Wiley";

        System.out.println(s.equals(s1)?"Strings are equal":"Strings are not equal");
        Dog myDog = new Dog();
        Dog yourDog = new Dog();

        System.out.println(myDog.equals(yourDog)?"Dogs Not Equal":"Dogs equal");
    }
}
