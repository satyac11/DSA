package Patterns.TwoPointers;

import java.util.Arrays;

public class DutchNationalFlagProblem {
    public static void sort(int []arr){
        int low=0,high=arr.length-1;
        for(int i=0;i<=high;){
            if(arr[i]==0){
                swap(arr,i,low);
                i++;
                low++;
            }
            else if(arr[i]==1)
                i++;
            else{
                swap(arr,i,high);
                high--;
            }
        }
        System.out.println("Sorted Array:"+Arrays.toString(arr));
    }
    public static void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        sort(new int[]{2, 2, 0, 1, 2, 0});
        sort(new int[]{1, 0, 2, 1, 0});
    }
}
