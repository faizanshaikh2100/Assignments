package day13.searching;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int arr[],int start,int end,int key){
        if(start>end)return -1;
        int mid = (start+end)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
            return binarySearch(arr,start,mid-1,key);
        }else if(arr[mid]<key) return binarySearch(arr,mid+1,end,key);
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7,10,49,29,73,67,20,63,20,4,6,17};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,0,arr.length-1,17));
    }
}
