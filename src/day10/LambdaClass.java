package day10;

import day9.Printable;




public class LambdaClass {
    static String printThing(Printable object){
       return object.print("Edge");
    }

    public static void main(String[] args) {
//        Product1 myProduct = new Product1();
//        printThing(myProduct);
        System.out.println(printThing(s-> "Wiley "+s));
    }
}
