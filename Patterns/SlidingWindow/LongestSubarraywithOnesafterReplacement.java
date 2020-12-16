package Patterns.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithOnesafterReplacement {
    public static int findLength(int []arr,int k){
        int start=0,maxLength=0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int end=0;end<arr.length;end++){
            int endChar = arr[end];
            map.put(endChar,map.getOrDefault(endChar,0)+1);

            while(map.get(0)>k){
                int startChar = arr[start];
                if(map.get(startChar)==1)
                    map.remove(startChar);
                else
                    map.put(startChar,map.get(startChar)-1);
                start++;
            }
            maxLength = Math.max(maxLength,end-start+1);

        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Max Length: "+findLength(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1},2));
        System.out.println("Max Length: "+findLength(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1},3));
    }
}
