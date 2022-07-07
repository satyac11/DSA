package Array;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int []nums,int k){
        int n = nums.length;
        for(int i=0;i<k;i++){
            int temp = nums[n-1];
            for(int j=n-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
        System.out.println("Rotated Array: "+ Arrays.toString(nums));
    }
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},3);
        rotate(new int[]{-1,-100,3,99}, 2);
    }
}
