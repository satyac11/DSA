package String.Problems.LeetCode;

/*Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

        Examples:

        s = "leetcode"
        return 0.

        s = "loveleetcode"
        return 2.


        Note: You may assume the string contains only lowercase English letters.*/

import java.util.*;

public class FirstUniqueCharacterinaString {
    //Brute Force
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j))
                    count++;
            }
            if (count == 0)
                return i;
        }
        return -1;
    }

    //Using String Methods it fails for input "cc"
    static int firsUniqChar1(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!s.substring(i + 1).contains(String.valueOf(c)))
                return i;
        }
        return -1;
    }

    //Using Map
    static int firsUniqChar2(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() == 1)
                return s.indexOf((char) entry.getKey());
        }
        return -1;
    }




    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("First Unique Char: " + s.charAt(firstUniqChar(s)));
        System.out.println("String Methods: " + firsUniqChar1(s));
        System.out.println("Using Map: " + firsUniqChar2(s));


    }
}
