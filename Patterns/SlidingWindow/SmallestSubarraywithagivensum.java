package Patterns.SlidingWindow;

public class SmallestSubarraywithagivensum {
    //Time Compleity---O(N*N)
    public static int smallestSubarray(int array[],int sumValue){
        for(int k=1;k<array.length;k++){
            if(isSumGreaterThanOrEqual(array,k,sumValue))
                return k;
        }
        return -1;

    }

    public static boolean isSumGreaterThanOrEqual(int array[], int k,int sumValue){
        int sum=0,start=0;
        for(int end=0;end<array.length;end++){
            sum = sum + array[end];
            if(end>=k-1){
                if(sum>=sumValue)
                    return true;
                sum = sum - array[start];
                start ++;
            }
        }
        return false;
    }

    //TimeComplexity O(n)
    public static int findMinSubArray(int array[],int s){
        int start=0,sum=0,minlength=Integer.MAX_VALUE;
        int n = array.length;
        for(int end=0;end<n;end++){
            sum = sum + array[end];

            while(sum>=s){
                int length = end-start+1;
                if(minlength>length)
                    minlength = length;
                sum = sum-array[start];
                start++;
            }
        }
        return minlength;
    }

    public static void main(String[] args) {
        System.out.println("O(n^2)");
        System.out.println("The smallest subarray with a sum greater than or equal to k is: "+smallestSubarray(new int[]{2, 1, 5, 2, 3, 2},7));
        System.out.println("The smallest subarray with a sum greater than or equal to k is: "+smallestSubarray(new int[]{2, 1, 5, 2, 8},7));
        System.out.println("The smallest subarray with a sum greater than or equal to k is: "+smallestSubarray(new int[]{3, 4, 1, 1, 6},8));

        System.out.println("O(n)");
        System.out.println("The smallest subarray with a sum greater than or equal to k is: "+findMinSubArray(new int[]{2, 1, 5, 2, 3, 2},7));
        System.out.println("The smallest subarray with a sum greater than or equal to k is: "+findMinSubArray(new int[]{2, 1, 5, 2, 8},7));
        System.out.println("The smallest subarray with a sum greater than or equal to k is: "+findMinSubArray(new int[]{3, 4, 1, 1, 6},8));
    }

}
