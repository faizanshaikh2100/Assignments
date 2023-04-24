package day3;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("First attempt");

        int arr[] = {1,2,3,4};
        try{
            System.out.println(arr[1]);
            System.out.println(arr[4]);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        try {
            System.out.println(12/0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
