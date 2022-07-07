package Patterns.TopKElements;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class SumOfElements {

    public static int findKthSmallestNumber(int []arr,int k){
        Queue<Integer> maxHeap = new PriorityQueue<>((n1,n2)->(n2-n1));

        for(int i=0;i<k;i++){
            maxHeap.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++){
            if(maxHeap.peek()>arr[i]){
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }

        return maxHeap.poll();
    }

    public static int findSumOfNumbers(int []arr,int k1,int k2){
        k1= findKthSmallestNumber(arr,k1);
        System.out.println(k1);
        k2 = findKthSmallestNumber(arr,k2);
        System.out.println(k2);
        int sum =0 ;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k1 && arr[i]<k2)
                sum = sum + arr[i];
        }
        return sum;
    }

    public static int findSumOfNumbersBestCase(int []arr,int k1,int k2){
        Queue<Integer> minHeap = new PriorityQueue<Integer>((n1,n2)->(n1-n2));
        for(int num: arr)
            minHeap.add(num);

        //remove first K1 elements
        for(int i=0;i<k1;i++)
            minHeap.poll();
        //Sum k2-k1-1 elements
        int sum=0;
        for(int i=0;i<k2-k1-1;i++)
            sum = sum+minHeap.poll();
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(findSumOfNumbers(new int[]{1, 3, 12, 5, 15, 11},3,6));
        System.out.println(findSumOfNumbersBestCase(new int[]{1, 3, 12, 5, 15, 11},3,6));

    }
}
