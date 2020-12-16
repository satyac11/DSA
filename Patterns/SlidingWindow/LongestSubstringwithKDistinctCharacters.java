package Patterns.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithKDistinctCharacters {

    public static int longestSubString(String string, int k){
        int start=0,longestStringLength=0;
        Map<Character,Integer> map = new HashMap<>();

        for(int end=0;end<string.length();end++){
            Character chr = string.charAt(end);
            map.put(chr,map.getOrDefault(chr,0)+1);

            while(map.size()>k){
                int length = end-start;
                if(longestStringLength<length)
                    longestStringLength = length;

                Character firstChar = string.charAt(start);
                if(map.get(firstChar)==1)
                    map.remove(firstChar);
                else
                    map.put(firstChar,map.get(firstChar)-1);
                start++;
            }
        }
        return longestStringLength;
    }

    public static void main(String[] args) {
        System.out.println("The longest substring with no more than k distinct characters is: "+longestSubString("araaci",2));
        System.out.println("The longest substring with no more than k distinct characters is: "+longestSubString("araaci",1));
        System.out.println("The longest substring with no more than k distinct characters is: "+longestSubString("cbbebi",3));
    }
}
