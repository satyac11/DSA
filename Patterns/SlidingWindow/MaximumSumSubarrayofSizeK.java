package Patterns.SlidingWindow;

public class MaximumSumSubarrayofSizeK {

    public static int maxSumSubArray(int []array,int k){
        int max=0,start=0,sum=0;

        for(int end=0;end<array.length;end++){
            sum = sum+array[end];
            if(end>=k-1){
                if(max<sum)
                    max =sum;
                sum = sum - array[start];
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max Sum of SubArray: "+maxSumSubArray(new int[]{2, 1, 5, 1, 3, 2},3));
        System.out.println("Max Sum of SubArray: "+maxSumSubArray(new int[]{2, 3, 4, 1, 5},2));

    }
}
