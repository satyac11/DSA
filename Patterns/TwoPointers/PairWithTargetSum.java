package Patterns.TwoPointers;

import java.util.Arrays;

public class PairWithTargetSum {

    public static int[] search(int []arr,int targetSum){
        int start=0,end=arr.length-1;

        while(start<end){
            int sum = arr[start]+arr[end];

            if(sum<targetSum)
                start++;
            else if(sum>targetSum)
                end--;
            else
                return new int[]{start,end};

        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        System.out.println("Target Sum Indices: "+ Arrays.toString(search(new int[]{1, 2, 3, 4, 6},6)));
        System.out.println("Target Sum Indices: "+Arrays.toString(search(new int[]{2, 5, 9, 11},11)));
    }


}
