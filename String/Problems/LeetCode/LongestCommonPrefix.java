package String.Problems.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder();

        if(strs.length == 0)
            return "";
        String temp = strs[0];
        String result="";

        strsLoop: for(int i=1;i<strs.length;i++){
            String str = strs[i];
            result ="";
            tempLoop: for(int j=0;j<temp.length();j++){
                lcp.delete(0,lcp.length());
                strLoop: for(int k=0;k<str.length();k++){
                    if(temp.charAt(0)!=str.charAt(0))
                        break strsLoop;
                    if((j+k)<temp.length() && temp.charAt(j+k)==str.charAt(k))
                        lcp.append(str.charAt(k));
                    else
                        break;
                }
                if(lcp.length()>=result.length()){
                    result = lcp.toString();

                }

            }
            if(result.length()==0)
                return "";
            else{
                temp = result;
            }
        }
        return result;

    }
    //using String methods
    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    //0ms solution Vertical scanning

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }


    public static void main(String[] args) {
        String []strs = {"flower","flow","flight"};
        //String [] strs ={"cartoon","racecar","car"};
        //String [] strs={"reflower","flow","flight"};
        //String [] strs={"aaa","aa","aaa"};

        System.out.println("Longest Common Prefix: "+longestCommonPrefix(strs));
        System.out.println("Longest Common Prefix: "+longestCommonPrefix1(strs));

    }
}
