package day10;

@FunctionalInterface
public interface Child extends Parent{
    public void sayHello();

    default void sayHi(){

    }
    //Method of object class
    String toString();
    int hashCode();
    boolean equals(Object obj);
}
