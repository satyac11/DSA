package Patterns.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {

    public static int findLength(char []array){
        int start =0,maxLength=0;
        Map<Character,Integer> map = new HashMap<>();

        for(int end=0;end<array.length;end++){
            char endChar = array[end];
            map.put(endChar,map.getOrDefault(endChar,0)+1);

            while(map.get(endChar)>1){
                int length = end-start;
                if (maxLength<length)
                    maxLength = length;

                char startChar = array[start];
                if(map.get(startChar)==1)
                    map.remove(startChar);
                else
                    map.put(startChar,map.get(startChar)-1);
                start++;
            }


        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the Longest Substring: "+findLength("aabccbb".toCharArray()));
        System.out.println("Length of the Longest Substring: "+findLength("abbbb".toCharArray()));
        System.out.println("Length of the Longest Substring: "+findLength("abccde".toCharArray()));
    }
}
