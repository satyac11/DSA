package Arrays.Problems;

import java.util.Arrays;

public class RotateArray {

    //Solution 1:
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>=n)
            return;
        while (k > 0) {
            int last = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
            k--;
        }
        System.out.println("Array After Rotation: "+ Arrays.toString(nums));
    }

    //Solution 2
    public static void rotate1(int nums[], int k){
        int n = nums.length;
        int [] temp = new int[n];

        for(int i=0;i<n;i++){
            temp[(i+k)%n] = nums[i];
        }

        for(int j=0;j<n;j++){
            nums[j] = temp[j];
        }

        System.out.println("Array After Rotation: "+ Arrays.toString(nums));
    }

    //Solution 3
    public static void rotate2(int nums[], int k){
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.out.println("Array After Rotation: "+ Arrays.toString(nums));
    }

    public static void reverse(int nums[],int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 7;
        rotate(nums,k);
    }
}
