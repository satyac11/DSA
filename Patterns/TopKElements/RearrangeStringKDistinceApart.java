package Patterns.TopKElements;

import java.util.*;

public class RearrangeStringKDistinceApart {

    public static String reArrangeStringWithKDistance(String str, int k) {
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        Queue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> (e2.getValue() - e1.getValue()));
        StringBuilder result = new StringBuilder();
        if (str.length() < k)
            return str;
        for (char ch : arr)
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }
        Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();

        while(!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();
            result.append(currentEntry.getKey());
            currentEntry.setValue(currentEntry.getValue() - 1);
            queue.offer(currentEntry);
            if(queue.size()==k){
                Map.Entry<Character,Integer> entry = queue.poll();
                if(entry.getValue()>0)
                    maxHeap.add(entry);
            }

        }
        return result.length()==str.length()?result.toString():"Empty";

    }

    public static void main(String[] args) {

        System.out.println(reArrangeStringWithKDistance("mmpp",2));
        System.out.println(reArrangeStringWithKDistance("programming", 3));

    }
}
