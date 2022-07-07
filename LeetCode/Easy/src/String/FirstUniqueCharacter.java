package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1)
                return s.indexOf(entry.getKey());
        }
        return -1;
    }

    public static int firstUniqCharBS(String s){
        int []arr = new int[26];
        char [] chars = s.toCharArray();
        /*for(int i=0;i<s.length();i++){
            char c = chars[i];
            arr[c-'a']+=1;
        }*/
        for(char c :s.toCharArray()){
            arr[c-'a']++;
        }

        for(int j=0;j<s.length();j++){
            if(arr[s.charAt(j)-'a']==1)
                return j;
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));

        System.out.println(firstUniqCharBS("leetcode"));
        System.out.println(firstUniqCharBS("loveleetcode"));
        System.out.println(firstUniqCharBS("aabb"));


    }
}
