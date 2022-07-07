package Patterns.TopKElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RearrangeString {

    public static String rearrangeString(String str){
        char []arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char ch: arr)
            map.put(ch,map.getOrDefault(ch,0)+1);

        Queue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<>((e1,e2)->(e2.getValue()-e1.getValue()));
        for(Map.Entry<Character,Integer> entry: map.entrySet())
            maxHeap.add(entry);

        StringBuilder sb = new StringBuilder();
        char lastChar=' ';
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry = maxHeap.poll();
            if(lastChar != entry.getKey()){
                sb.append(entry.getKey());
                entry.setValue(entry.getValue()-1);
                lastChar = entry.getKey();
                if(entry.getValue()>0)
                    maxHeap.add(entry);
            }
            else{
                return "Empty";
            }

        }

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(rearrangeString("aappp"));
        System.out.println(rearrangeString("aapa"));
        System.out.println(rearrangeString("Programming"));


    }
}
