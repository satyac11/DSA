package Patterns.TopKElements;

import java.util.*;

public class TopKFrequentNumbers {

    public static List<Integer> findTopKFrequentNumbers(int []arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<Map.Entry<Integer,Integer>>((e1,e2)->(e1.getValue()-e2.getValue()));
        for(int i=0;i<arr.length;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        /*for(int i=0;i<k;i++)
            minHeap.add(map.get(arr[i]));
        for(int i=k;i<map.size();i++){
            if(map.get(arr[i])>=minHeap.peek()){
                minHeap.poll();
                minHeap.add(map.get(arr[i]));
            }
        }*/


        List<Integer> result = new ArrayList<>(k);
        while(!minHeap.isEmpty()){
            result.add(minHeap.poll().getKey());
        }
        /*while(!minHeap.isEmpty()){
            int value = minHeap.poll();
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue() == value){
                    result.add(entry.getKey());
                    map.remove(entry.getKey());
                    break;
                }
            }
        }*/

    return result;
    }
    public static void main(String[] args) {
        System.out.println(findTopKFrequentNumbers(new int[]{5,12,11,3,11},2));
        System.out.println(findTopKFrequentNumbers(new int[]{1, 3, 5, 12, 11, 12, 11},2));
    }
}
