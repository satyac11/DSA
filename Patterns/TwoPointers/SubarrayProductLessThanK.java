package Patterns.TwoPointers;

/*Given an array of positive numbers, calculate the number of possible contiguous subarrays having product lesser than a given number K.*/
public class SubarrayProductLessThanK {
    public static int countSubArrays(int []arr,int k){
        int left=0,right=0;
        int count = 0;
        int prod=1;
        while(right<arr.length){
            prod = prod*arr[right];
            while(prod>=k){
                prod = prod/arr[left];
                left++;
            }
            count += right-left+1;
            right++;

        }
        return count;

    }

    public static void main(String[] args) {
        //System.out.println("No of Sub Arrays: "+countSubArrays(new int[]{10,5,2,6},100));
        System.out.println("No of Sub Arrays: "+countSubArrays(new int[]{1, 2, 3, 4,5},10));
        //System.out.println("No of Sub Arrays: "+countSubArrays(new int[]{1, 9, 2, 8, 6, 4, 3},100));

    }
}
