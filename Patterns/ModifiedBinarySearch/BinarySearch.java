package Patterns.ModifiedBinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int []array,int key){
        Arrays.sort(array);
        int start=0,end=array.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(key == array[mid]){
                return mid;
            }

            if (key < array[mid]) {
                end = mid-1;
            }else
                start = mid+1;

        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,6,10},10));
        System.out.println(search(new int[]{1,2,3,4,5,6,7},5));
        System.out.println(search(new int[]{10,6,4},10));
        System.out.println(search(new int[]{10,6,4},4));
    }
}
