package day13.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {7,10,49,29,73,67,20,63,20,4,6,17};

        int key = 17;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==key) System.out.println(i);
            return;
        }
        System.out.println(-1);
    }
}
