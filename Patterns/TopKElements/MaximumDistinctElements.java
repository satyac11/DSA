package Patterns.TopKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumDistinctElements {

    public static int findMaxDistinctElements(int[]arr,int k){
        int count=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        Queue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((e1,e2)->(e1.getValue()-e2.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1)
                minHeap.add(entry);
            else
                count++;
        }

        while(k>0 && !minHeap.isEmpty()){
            Map.Entry<Integer,Integer> entry = minHeap.poll();
           /* if(k>=entry.getValue()){
                k = k-(entry.getValue()-1);
                count++;
            }
            else if(k<entry.getValue()){
                entry.setValue(entry.getValue()-k);
                k--;
                minHeap.add(entry);
            }*/
           k = k-(entry.getValue()-1);
           if(k>=0)
               count++;
        }
        if(k>0)
            count = count-k;


               return count;
    }

    public static void main(String[] args) {
        System.out.println(findMaxDistinctElements(new int[]{7, 3, 5, 8, 5, 3, 3},2));
        System.out.println(findMaxDistinctElements(new int[]{3, 5, 12, 11, 12},3));
        System.out.println(findMaxDistinctElements(new int[]{1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5},2));

    }
}
