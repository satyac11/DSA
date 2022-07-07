package Patterns.TopKElements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestNumbers {

    public static List<Integer> findKClosestNumbers(int []arr,int k,int x){
        Queue<Integer> minHeap = new PriorityQueue<>((n1,n2)->(n1-n2));
        for(int i=0;i<k;i++)
            minHeap.add(arr[i]);
        for(int i=k;i<arr.length;i++){
            if(arr[i]<x){
                minHeap.poll();
                minHeap.add(arr[i]);
            }

        }

        List<Integer> closestNumbers = new ArrayList<>(k);
        while(!minHeap.isEmpty())
            closestNumbers.add(minHeap.poll());

        return closestNumbers;
    }



    public static void main(String[] args) {
        System.out.println(findKClosestNumbers(new int[]{5, 6, 7, 8, 9},3,7));
    }
}
