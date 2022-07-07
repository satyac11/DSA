package Patterns.TopKElements;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestNumber {

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

    public static void main(String[] args) {
        System.out.println(findKthSmallestNumber(new int[]{1,4,2,6,5},3));
    }
}
