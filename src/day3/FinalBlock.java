package day3;

public class FinalBlock {
    public static void main(String[] args) {
        try{
            System.out.println("11111");
            System.out.println("wiley");
            System.out.println("edge");
        }
        catch(Exception e){
            System.out.println("catch block");
            System.exit(0);
            System.out.println(10/0);
            e.printStackTrace();
        }
        finally{
            System.out.println("Clone connection");
        }
    }
}
