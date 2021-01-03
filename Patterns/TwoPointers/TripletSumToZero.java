package Patterns.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {
    public static List<List<Integer>> searchTriplets(int []arr){
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
           searchPair(arr,-arr[i],i+1,triplets);//x+y+z=0=>y+z=-x
        }
        return triplets;
    }

    public static List<Integer> searchPair(int []arr,int targetSum,int left,List<List<Integer>> triplets){
        //System.out.println("sorted array: "+Arrays.toString(arr));
        int start =left,end= arr.length-1;
        List<Integer> triplet = new ArrayList<>();
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum<targetSum)
                start++;
            else if(sum>targetSum)
                end--;
            else{
                triplet.add(arr[left-1]);
                triplet.add(arr[start]);
                triplet.add(arr[end]);
                start++;
                end--;
                triplets.add(triplet);
                triplet = new ArrayList<>();
            }
        }
        return triplet;
    }
    public static void main(String[] args) {
        System.out.println("Triplets: "+searchTriplets(new int[]{-3, 0, 1, 2, -1, 1, -2}));
        System.out.println("Triplets: "+searchTriplets(new int[]{-5, 2, -1, -2, 3}));

    }
}
