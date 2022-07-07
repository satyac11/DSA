package Patterns.TopKElements;

import java.util.PriorityQueue;
import java.util.Queue;

public class ConnectRopes {

    public static int minimumCostToConnectRopes(int []arr){
        Queue<Integer> minHeap = new PriorityQueue<>((n1,n2)->(n1-n2));
        for(int i=0;i<arr.length;i++)
            minHeap.add(arr[i]);
        int temp=0,cost=0;
        while(minHeap.size()>1){
            temp = minHeap.poll()+minHeap.poll();
            cost = cost+temp;
            minHeap.add(temp);
        }
        return cost;
    }

    public static void main(String[] args) {
        System.out.println("Minimum cost: "+minimumCostToConnectRopes(new int[]{1,3,11,5}));
    }
}
