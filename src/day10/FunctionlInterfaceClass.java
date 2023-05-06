package day10;

interface Calc{
    int calculate(int val);
}
public class FunctionlInterfaceClass {
    public static void main(String[] args) {
        Calc calc = (int val)->val+54;
        System.out.println(calc.calculate(54));
    }
}
