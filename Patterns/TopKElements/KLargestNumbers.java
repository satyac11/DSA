package Patterns.TopKElements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class KLargestNumbers {

    public static List<Integer> findKLargestNumbers(int []arr,int k){
        Queue<Integer> minHeap = new PriorityQueue<Integer>((n1,n2)->(n1-n2));
        for(int i=0;i<k;i++){
            minHeap.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++){
            if(arr[k]>minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }

        }
        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {
        System.out.println(findKLargestNumbers(new int[]{1,4,2,6,5},2));

    }
}
