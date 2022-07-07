package Patterns.TopKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class FrequencySort {

    public static String sortCharsByFrequency(String data){
        char []arr = data.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char ch: arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        Queue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((e1,e2)->(e2.getValue()-e1.getValue()));
        /*for(Map.Entry<Character,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }*/
        maxHeap.addAll(map.entrySet());
        StringBuilder stringBd = new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry = maxHeap.poll();
            int n = entry.getValue();
            char ch = entry.getKey();
            for(int i=0;i<n;i++)
                stringBd.append(ch);
        }
        return stringBd.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortCharsByFrequency("satya"));
        System.out.println(sortCharsByFrequency("Programming"));
        System.out.println(sortCharsByFrequency("abcbab"));
    }
}
