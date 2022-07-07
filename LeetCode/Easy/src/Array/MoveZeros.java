package Array;

import java.util.Arrays;

public class MoveZeros {

    public static int [] moveZeroesAvg(int []nums){
        if(nums.length<1)
            return nums;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=0)
                i++;
            if(nums[i]==0  && nums[j]!=0){
                swap(i,j,nums);
                i++;
            }

        }
        return nums;
    }

    public static int [] moveZeroes(int []nums){
        for (int slowPointer = 0, fastPointer = 0; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != 0) {
                swap(slowPointer++, fastPointer,nums);
            }
        }
        return nums;
    }

    public static void swap(int i,int j,int []nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,1,0,2,3})));
        System.out.println(Arrays.toString(moveZeroes(new int[]{0})));
        System.out.println(Arrays.toString(moveZeroes(new int[]{1,0,1})));
    }
}
