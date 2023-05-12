package day14;

public class EnhancedLoops {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        long start = System.currentTimeMillis();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken For loop: "+(end-start));

         start = System.currentTimeMillis();
        System.out.println();
        for(int element:arr){
            System.out.print(element+" ");
        }
         end = System.currentTimeMillis();
        System.out.println("Time taken For each loop: "+(end-start));



    }
}
