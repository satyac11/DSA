package Heap;

import java.util.Arrays;

public class Heap {

    public static void insert(int []arr, int position){
        int temp = arr[position];
        int i =position;
        while(i>1 && temp>arr[i/2]){
            if(temp>arr[i/2])
                arr[i] = arr[i/2];
            i = i/2;
        }
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int []arr = new int[]{0,30,20,15,5,10,12,6,40};
        insert(arr,arr.length-1);
        System.out.println("Max Heap: "+ Arrays.toString(arr));

    }
}
