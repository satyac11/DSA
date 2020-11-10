package String.Problems.LeetCode;

//Problem Description
/*Given two strings s and t , write a function to determine if t is an anagram of s.

        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:

        Input: s = "rat", t = "car"
        Output: false
        Note:
        You may assume the string contains only lowercase alphabets.

        Follow up:
        What if the inputs contain unicode characters? How would you adapt your solution to such case?*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidAnagram {
    //Using List
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        for (int j = 0; j < t.length(); j++) {
            Character c = t.charAt(j);
            if (list.contains(c))
                list.remove(c);
        }

        if (list.size() == 0)
            return true;
        else
            return false;

    }

    //Using Map
    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);


        for (int j = 0; j < t.length(); j++) {
            Character c = t.charAt(j);
            Integer value = map.get(c);
            if (value != null && value > 1)
                map.put(c, map.get(c) - 1);
            else if (value != null && value == 1)
                map.remove(c);
        }

        if (map.size() == 0)
            return true;
        else
            return false;

    }

    //Using Hash table
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;

        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Is Anagrams: " + isAnagram(s, t));
        System.out.println("Is Anagrams: " + isAnagram1(s, t));
        System.out.println("Is Arangram: "+ isAnagram2(s,t));
    }
}
