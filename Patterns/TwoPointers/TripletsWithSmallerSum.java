package Patterns.TwoPointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {

    public static int searchTriplets(int []arr,int targetSum){
        int result =0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
            result = result+findPairsWithSamllerSum(arr,targetSum-arr[i],i+1);
        return result;
    }
    public static int findPairsWithSamllerSum(int []arr,int targetSum, int left){
        int count =0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]<targetSum){
                count = count+(right-left);
                left++;
            }
            right--;
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println("Total No of Triplets: "+searchTriplets(new int[]{-1, 0, 2, 3},3));
        System.out.println("Total No of Triplets: "+searchTriplets(new int[]{-1, 4, 2, 1, 3},5));
    }
}
