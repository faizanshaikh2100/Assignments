package day7.generics;

public class Printer<T> {
    T valToPrint;

    public Printer(T valToPrint){
        super();
        this.valToPrint = valToPrint;
    }
    public void print(){
        System.out.println(valToPrint);
    }
}
