package Patterns.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationInaString {
    public static boolean findPermutation(String str, String pattern){
        int start =0,matched=0;

        Map<Character,Integer> patternMap = new HashMap<>();
        for(char c: pattern.toCharArray())
            patternMap.put(c,patternMap.getOrDefault(c,0)+1);

        for(int end=0;end<str.length();end++){
            char endChar = str.charAt(end);
            if(patternMap.containsKey(endChar)){
                patternMap.put(endChar,patternMap.get(endChar)-1);
                if(patternMap.get(endChar)==0)
                    matched++;
            }

            if(matched == patternMap.size())
                return true;

            if(end>=pattern.length()-1){
                char startChar = str.charAt(start);
                if(patternMap.containsKey(startChar)){
                    if(patternMap.get(startChar)==0)
                        matched--;
                    patternMap.put(startChar,patternMap.get(startChar)+1);
                }
                start++;
            }


        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Permutation Exist: "+findPermutation("oidbcaf","abc"));
        System.out.println("Permutation Exist: "+findPermutation("bcdxabcdy","bcdyabcdx"));
        System.out.println("Permutation Exist: "+findPermutation("aaacb","abc"));
        System.out.println("Permutation Exist: "+findPermutation("odicf","dc"));
    }
}
