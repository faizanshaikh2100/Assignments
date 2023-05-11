package day13.sorting;

public class MergeSort {

    // private void bubbleSort(int nums[])
    // {
    //     for(int i = 0; i < nums.length -1;i++){
    //         for(int j = 0 ; j < nums.length - 1 -8i;j++){
    //           if(nums[j] > nums[j + 1]){
    //               int temp = nums[j];
    //               nums[j]= nums[j + 1];
    //               nums[j + 1] = temp;
    //           }
    //         }
    //     }
    // }
    // private void insertionSort(int nums[])
    // {
    //     for(int i = 1; i < nums.length;i++){
    //         for(int j = i ; j > 0;j--){
    //           if(nums[j] < nums[j - 1]){
    //               int temp = nums[j];
    //               nums[j]= nums[j - 1];
    //               nums[j - 1] = temp;
    //           }
    //         }
    //     }
    // }
    // private void selectionSort(int nums[]){
    //     int mini = 0;
    //     for(int i = 0; i < nums.length - 1; i++){
    //         mini = i;
    //         for(int j = i; j < nums.length; j++){
    //             if(nums[j] < nums[mini])mini = j;
    //         }
    //         int temp = nums[mini];
    //         nums[mini] = nums[i];
    //         nums[i] = temp;
    //     }
    // }
    private static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
        while (j <= mid) {
            arr[k] = temp[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 6,1,4,2};
        mergeSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
