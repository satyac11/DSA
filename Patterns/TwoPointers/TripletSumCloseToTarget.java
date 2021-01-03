package Patterns.TwoPointers;

import java.util.Arrays;

public class TripletSumCloseToTarget {
    public static int threeSumClosest(int []nums,int target){
        int min = Integer.MIN_VALUE;
        int result =0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);
                if(diff ==0)
                    return sum;
                if(diff<min){
                    min = diff;
                    result = sum;
                }
                if(sum<=target){
                    left++;
                }
                else{
                  right--;
                }
            }
        }
        return result;
    }
}
